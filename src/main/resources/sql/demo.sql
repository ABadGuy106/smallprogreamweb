/*
Navicat MySQL Data Transfer

Source Server         : 118.24.166.176
Source Server Version : 50635
Source Host           : 118.24.166.176:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50635
File Encoding         : 65001

Date: 2018-07-19 18:33:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_area
-- ----------------------------
DROP TABLE IF EXISTS `tb_area`;
CREATE TABLE `tb_area` (
  `area_id` int(11) NOT NULL AUTO_INCREMENT,
  `area_name` varchar(255) DEFAULT NULL,
  `priority` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`area_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_area
-- ----------------------------
INSERT INTO `tb_area` VALUES ('1', '西区', '2', '2018-07-18 18:19:10');
INSERT INTO `tb_area` VALUES ('2', '北区', '2', '2018-07-18 21:19:26');
INSERT INTO `tb_area` VALUES ('4', '东区', '3', '2018-07-19 11:41:47');
INSERT INTO `tb_area` VALUES ('5', '东区', '3', '2018-07-19 15:15:04');
