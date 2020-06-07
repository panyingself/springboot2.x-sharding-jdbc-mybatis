///*
// *
// *  * Copyright (c) 2019. tdc.shangri-la.com. All Rights Reserved.
// *
// */
//
//package com.toxic.anepoch.entitystore.service.database.sharding;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.shardingsphere.shardingjdbc.api.yaml.YamlShardingDataSourceFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.PlatformTransactionManager;
//
//import javax.sql.DataSource;
//import java.io.File;
//
///**
// * @author ying.pan
// * @date 2020/6/1 5:54 PM.
// */
//@Configuration
//public class ShardingConfig {
//    private static final Logger LOGGER = LoggerFactory.getLogger(ShardingConfig.class);
//
//    @Bean
//    public DataSource dataSource() throws Exception {
//        LOGGER.info("加载ShardingConfig信息......");
//        Resource resource = new ClassPathResource("sharding.yml");
//        File file = resource.getFile();
//        DataSource dataSource = YamlShardingDataSourceFactory.createDataSource(file);
//        return dataSource;
//    }
//
//    @Bean
//    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
//        LOGGER.info("加载SqlSessionFactory信息......");
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource());
//        return sqlSessionFactoryBean.getObject();
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager() throws Exception {
//        LOGGER.info("加载SqlSessionFactory 事务信息......");
//        return new DataSourceTransactionManager(dataSource());
//    }
//}
