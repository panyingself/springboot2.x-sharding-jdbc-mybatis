package com.toxic.anepoch.entitystore.service.config.sharding;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.shardingsphere.api.config.masterslave.MasterSlaveRuleConfiguration;
import org.apache.shardingsphere.shardingjdbc.api.MasterSlaveDataSourceFactory;
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
 * @date 2020/6/2 5:23 PM.
 * 读写分离类
 */
@Configuration
public class DataSourceConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataSourceConfig.class);

    @Resource
    private MasterDataBaseConfig masterDbConfig;
    @Resource
    private Slave0DataBaseConfig slave0DataBaseConfig;
    @Resource
    private Slave1DataBaseConfig slave1DataBaseConfig;

    @Bean
    public DataSource getDataSouce() throws SQLException {
        LOGGER.info("初始化默认sharding-jdbc数据源");
        DataSource dataSource = this.buildDataSource();
        return dataSource;
    }

    private DataSource buildDataSource() throws SQLException {
        //设置从库数据源集合
        Map<String, DataSource> dataSourceMap = Maps.newConcurrentMap();
        dataSourceMap.put("ds_master", masterDbConfig.createDataSouce());
        dataSourceMap.put("ds_slave0", slave0DataBaseConfig.createDataSouce());
        dataSourceMap.put("ds_slave1", slave1DataBaseConfig.createDataSouce());


        MasterSlaveRuleConfiguration masterSlaveRuleConfiguration = new MasterSlaveRuleConfiguration(
                "ds_master_slave",
                "ds_master",
                Lists.<String>newArrayList("ds_slave0", "ds_slave1"));

        return MasterSlaveDataSourceFactory.createDataSource(dataSourceMap, masterSlaveRuleConfiguration, new Properties());
    }
}
