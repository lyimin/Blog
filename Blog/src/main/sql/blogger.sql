DROP DATABASE IF EXISTS ssm_blog;

/*创建数据库，并设置编码*/
CREATE DATABASE ssm_blog
  DEFAULT CHARACTER SET utf8;

USE ssm_blog;

CREATE TABLE `t_blogger` (
  `id`        INT(11)      NOT NULL AUTO_INCREMENT
  COMMENT '博主id',
  `username`  VARCHAR(50)  NOT NULL
  COMMENT '博主用户名',
  `password`  VARCHAR(100) NOT NULL
  COMMENT '博主密码',
  `profile`   TEXT COMMENT '博主信息',
  `nickname`  VARCHAR(50)  NOT NULL
  COMMENT '博主昵称',
  `sign`      VARCHAR(100) COMMENT '博主签名',
  `imagename` VARCHAR(100) COMMENT '头像url',
  PRIMARY KEY (`id`)
)
  ENGINE = INNODB
  AUTO_INCREMENT = 2
  DEFAULT CHARSET = utf8;