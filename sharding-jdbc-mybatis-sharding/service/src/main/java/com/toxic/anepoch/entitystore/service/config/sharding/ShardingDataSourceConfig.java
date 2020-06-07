package com.toxic.anepoch.entitystore.service.config.sharding;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.shardingsphere.api.config.masterslave.MasterSlaveRuleConfiguration;
import org.apache.shardingsphere.api.config.sharding.KeyGeneratorConfiguration;
import org.apache.shardingsphere.api.config.sharding.ShardingRuleConfiguration;
import org.apache.shardingsphere.api.config.sharding.TableRuleConfiguration;
import org.apache.shardingsphere.api.config.sharding.strategy.InlineShardingStrategyConfiguration;
import org.apache.shardingsphere.shardingjdbc.api.ShardingDataSourceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Map;
import java.util.Properties;

/**
 * @author ying.pan
 * @date 2020/6/7 2:42 PM.
 * sharding-jdbc分片配置类
 */
@Configuration
public class ShardingDataSourceConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(ShardingDataSourceConfig.class);

    @Resource
    private MasterDataBaseConfig masterDbConfig;
    @Resource
    private Slave0DataBaseConfig slave0DataBaseConfig;

    @Bean
    public DataSource getDataSouce() throws SQLException {
        LOGGER.info("初始化默认sharding-jdbc-sharding数据源");
        DataSource dataSource = this.buildDataSource();
        return dataSource;
    }

    private DataSource buildDataSource() throws SQLException {
        //设置从库数据源集合
        Map<String, DataSource> dataSourceMap = Maps.newConcurrentMap();
        dataSourceMap.put("ds0", masterDbConfig.createDataSouce());
        dataSourceMap.put("ds1", slave0DataBaseConfig.createDataSouce());


        // 配置Order表规则 - 哪些库的哪些表参与规则,使用行表达式
        TableRuleConfiguration entityDetailTableRuleConfig = new TableRuleConfiguration("entity_detail_", "ds${0..1}.entity_detail_${0..1}");

        // 配置分库 + 分表策略
        entityDetailTableRuleConfig.setDatabaseShardingStrategyConfig(new InlineShardingStrategyConfiguration("entity_id", "ds${entity_id % 2}"));

        entityDetailTableRuleConfig.setTableShardingStrategyConfig(new InlineShardingStrategyConfiguration("entity_id", "entity_detail_${entity_id % 2}"));

        // 配置分片规则
        ShardingRuleConfiguration shardingRuleConfig = new ShardingRuleConfiguration();
        shardingRuleConfig.setTableRuleConfigs(Lists.newArrayList(entityDetailTableRuleConfig));
        shardingRuleConfig.setDefaultDataSourceName("ds0");

        // 获取数据源对象
        return ShardingDataSourceFactory.createDataSource(dataSourceMap, shardingRuleConfig, this.getProperties());
    }


    private  Properties getProperties() {
        Properties properties = new Properties();
        properties.setProperty("sql.show","true");
        return properties;
    }
}
