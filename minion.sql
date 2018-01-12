/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : minion

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2018-01-12 18:42:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for demo_user
-- ----------------------------
DROP TABLE IF EXISTS `demo_user`;
CREATE TABLE `demo_user` (
  `user_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',
  `username` varchar(32) NOT NULL COMMENT '帐号',
  `password` varchar(32) NOT NULL COMMENT '密码',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of demo_user
-- ----------------------------
INSERT INTO `demo_user` VALUES ('3', 'shuzheng', '123456');
INSERT INTO `demo_user` VALUES ('4', 'shuzheng', '123456');
INSERT INTO `demo_user` VALUES ('5', 'shuzheng', '123456');
INSERT INTO `demo_user` VALUES ('6', 'shuzheng', '123456');
INSERT INTO `demo_user` VALUES ('7', 'shuzheng', '123456');
INSERT INTO `demo_user` VALUES ('10', 'test', '123456');
INSERT INTO `demo_user` VALUES ('11', 'aaa', '123456');
