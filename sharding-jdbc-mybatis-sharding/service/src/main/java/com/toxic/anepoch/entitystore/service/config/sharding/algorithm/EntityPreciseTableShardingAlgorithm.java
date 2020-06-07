/*
 *
 *  * Copyright (c) 2019. tdc.shangri-la.com. All Rights Reserved.
 *
 */

package com.toxic.anepoch.entitystore.service.config.sharding.algorithm;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

/**
 * @author ying.pan
 * @date 2020/6/7 3:51 PM.
 */
public class EntityPreciseTableShardingAlgorithm implements PreciseShardingAlgorithm<Long> {
    private static final Logger LOGGER = LoggerFactory.getLogger(EntityPreciseTableShardingAlgorithm.class);

    /**
     * Sharding.
     *
     * @param availableTargetNames available data sources or tables's names
     * @param shardingValue        sharding value
     * @return sharding result for data source or table's name
     */
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Long> shardingValue) {
        // 默认表名：<logicTableName>
        StringBuilder tableName = new StringBuilder(shardingValue.getLogicTableName());
        LOGGER.info("当前默认表名tableName: [ {} ]", tableName);
        return tableName.toString();
    }
}
