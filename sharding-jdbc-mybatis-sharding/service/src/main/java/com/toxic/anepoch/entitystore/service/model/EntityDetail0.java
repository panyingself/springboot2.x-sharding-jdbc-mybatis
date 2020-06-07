

package com.toxic.anepoch.entitystore.service.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author py
 * @date 2019/4
 */
public class EntityDetail0 implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;


    /**
     * id
     */
    private Long id;

    /**
     * 实体id
     */
    private Long entityId;

    /**
     * 更新时的版本号
     */
    private Integer version;

    /**
     * 实体详情type,区分不同模块数据
     */
    private String section;

    /**
     * 实体详情数据
     */
    private String data;

    /**
     * 创建时间
     */
    private java.util.Date createDate;

    /**
     * 更新时间
     */
    private java.util.Date updateTime;

    public Long getId() {
        return this.id;
    }

    public void setId(Long value) {
        this.id = value;
    }


    public Long getEntityId() {
        return this.entityId;
    }

    public void setEntityId(Long value) {
        this.entityId = value;
    }


    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer value) {
        this.version = value;
    }


    public String getSection() {
        return this.section;
    }

    public void setSection(String value) {
        this.section = value;
    }


    public String getData() {
        return this.data;
    }

    public void setData(String value) {
        this.data = value;
    }


    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(java.util.Date value) {
        this.createDate = value;
    }


    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(java.util.Date value) {
        this.updateTime = value;
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }

}

