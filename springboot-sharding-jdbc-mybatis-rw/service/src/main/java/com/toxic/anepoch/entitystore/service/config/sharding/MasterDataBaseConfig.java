package com.toxic.anepoch.entitystore.service.config.sharding;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;
import static org.apache.commons.lang3.builder.ToStringStyle.JSON_STYLE;

/**
 * @author ying.pan
 * @date 2020/6/2 5:12 PM.
 */
@Component
@PropertySource(value = "classpath:sharding-jdbc.properties")
@ConfigurationProperties(prefix = "ds.master")
public class MasterDataBaseConfig extends DataBaseConfigModel {
    @Override
    public String toString() {
        return reflectionToString(this, JSON_STYLE);
    }
}
