

package com.toxic.anepoch.entitystore.service.database.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;
import static org.apache.commons.lang3.builder.ToStringStyle.JSON_STYLE;


/**
 * 路由配置对象
 */
public class EntityShardingConfig implements Serializable {
    private long id;
    private int offsetDay;
    /**
     * 数据库后缀（在offset内的数据会写入到一个库）
     */
    private String dbSuffix;
    /**
     * 表的后缀列表，用英文逗号分隔
     */
    private String tableSuffix;
    /**
     * 内部处理使用
     */
    private List<String> tableSuffixList;
    private String entityTypeId;
    private Date createDate;
    private Date updateTime;

    public long getId() {
        return id;
    }

    public EntityShardingConfig setId(long id) {
        this.id = id;
        return this;
    }

    public int getOffsetDay() {
        return offsetDay;
    }

    public EntityShardingConfig setOffsetDay(int offsetDay) {
        this.offsetDay = offsetDay;
        return this;
    }

    public String getDbSuffix() {
        return dbSuffix;
    }

    public EntityShardingConfig setDbSuffix(String dbSuffix) {
        this.dbSuffix = dbSuffix;
        return this;
    }

    public String getTableSuffix() {
        return tableSuffix;
    }

    public EntityShardingConfig setTableSuffix(String tableSuffix) {
        this.tableSuffix = tableSuffix;
        return this;
    }

    public List<String> getTableSuffixList() {
        return tableSuffixList;
    }

    public EntityShardingConfig setTableSuffixList(List<String> tableSuffixList) {
        this.tableSuffixList = tableSuffixList;
        return this;
    }

    public String getEntityTypeId() {
        return entityTypeId;
    }

    public EntityShardingConfig setEntityTypeId(String entityTypeId) {
        this.entityTypeId = entityTypeId;
        return this;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public EntityShardingConfig setCreateDate(Date createDate) {
        this.createDate = createDate;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public EntityShardingConfig setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        return reflectionToString(this, JSON_STYLE);
    }

}
