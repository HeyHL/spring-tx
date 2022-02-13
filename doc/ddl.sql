CREATE TABLE `t_active_info` (
 `id` INT NOT NULL auto_increment COMMENT 'id',
 `active_name` varchar(64) DEFAULT NULL COMMENT '名称',
 `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
 `gmt_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
 PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='主信息';

CREATE TABLE `t_active_info_ext` (
 `id` INT NOT NULL auto_increment COMMENT 'id',
 `ext_msg` varchar(64) DEFAULT NULL COMMENT '扩展描述',
 `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
 `gmt_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
 PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='扩展信息';