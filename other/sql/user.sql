/*
Navicat MySQL Data Transfer

Source Server         : Local
Source Server Version : 50634
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50634
File Encoding         : 65001

Date: 2018-06-10 14:02:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) DEFAULT NULL,
  `user_age` int(11) DEFAULT NULL,
  `user_address` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'summer', '100', 'shanghai,pudong');
INSERT INTO `user` VALUES ('2', 'sun', '50', 'beijing,chaoyang');
INSERT INTO `user` VALUES ('5', 'winter', '10', 'heaven');
