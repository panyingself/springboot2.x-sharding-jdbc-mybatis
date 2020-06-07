# springboot-sharding-jdbc-mybatis
springboot2.x 集成sharding-jdbc &amp; mybatis项目demo,基于sharding-jdbc maven版本:

<dependency>
    <groupId>org.apache.shardingsphere</groupId>
    <artifactId>sharding-jdbc-core</artifactId>
    <version>${sharding-jdbc.version}</version>
</dependency>

download开箱即用.

================【读写分离demo】=============

【项目名称】: springboot-sharding-jdbc-mybatis-rw

【步骤】:

        step1 配置controller中的sharding-jdbc.properties文件.

        step2 配置service模块中的ShardingDataSourceConfig文件.

        step3 配置mybatis相关参数.

        step4 本地start 即可.
【测试】:

        测试-url insert: http://localhost:8080/testInsert

        测试-url list: http://localhost:8080/testList

=================【分库分表demo】============


【项目名称】: sharding-jdbc-mybatis-sharding
【步骤】:

        step1 配置controller中的sharding-jdbc.properties文件.

        step2 配置service模块中的ShardingDataSourceConfig文件.

        step3 配置mybatis相关参数.

        step4 本地start 即可.
        
【测试】:

        测试-url insert: http://localhost:8080/testInsert

        测试-url list: http://localhost:8080/testList
 

`注意: 读写分离查询列表的话，会将配置的db+table通过笛卡尔积的方式，将所有数据查询出来,使用的时候需要注意!`

`注意: sharding的配置分表前缀需要与mybatis中的表名一致`


#坑列表

    ①、分库分表提示table does not exist: https://www.jianshu.com/p/e3691f4bd45c





