package com.toxic.anepoch.entitystore.service.config.sharding;

import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;

import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;
import static org.apache.commons.lang3.builder.ToStringStyle.JSON_STYLE;

/**
 * @author ying.pan
 * @date 2020/6/4 3:28 PM.
 */
public class DataBaseConfigModel {
    private String url;
    private String username;
    private String password;
    private String driverClassName;

    public String getUrl() {
        return url;
    }

    public DataBaseConfigModel setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public DataBaseConfigModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public DataBaseConfigModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public DataBaseConfigModel setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
        return this;
    }

    DataSource createDataSouce() {
        DruidDataSource resultDataSource = new DruidDataSource();
        resultDataSource.setUsername(this.username);
        resultDataSource.setUrl(url);
        resultDataSource.setPassword(this.password);
        resultDataSource.setDriverClassName(this.driverClassName);
        return resultDataSource;
    }

    @Override
    public String toString() {
        return reflectionToString(this, JSON_STYLE);
    }
}
