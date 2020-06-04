CREATE TABLE `entity_storage_0`.`entity_detail`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `entity_id` bigint(20) NOT NULL COMMENT '实体id',
  `version` int(11) NOT NULL COMMENT '更新时的版本号',
  `section` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '实体详情type,区分不同模块数据',
  `data` mediumtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '实体详情数据',
  `create_date` datetime(0) NOT NULL COMMENT '创建时间',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uniq_entity_id_section`(`entity_id`, `section`) USING BTREE
) ENGINE = InnoDB COMMENT = '实体详情信息表';