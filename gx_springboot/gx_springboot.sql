/*
Navicat MySQL Data Transfer

Source Server         : 121.229.4.16_MySql
Source Server Version : 50727
Source Host           : 121.229.4.16:3306
Source Database       : gx_springboot

Target Server Type    : MYSQL
Target Server Version : 50727
File Encoding         : 65001

Date: 2021-04-19 17:05:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `userName` varchar(32) NOT NULL,
  `passWord` varchar(50) NOT NULL,
  `realName` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', 'admin', '管理员');
