package com.toxic.anepoch.entitystore.service.config.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ying.pan
 * @date 2019/9/4 9:33 PM.
 */
@MapperScan("com.toxic.anepoch.entitystore.service.mapper")
@Configuration
public class MybatisConfig {
}
