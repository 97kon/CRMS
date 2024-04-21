/*
 Navicat MySQL Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80029
 Source Host           : localhost:3306
 Source Schema         : crms

 Target Server Type    : MySQL
 Target Server Version : 80029
 File Encoding         : 65001

 Date: 21/04/2024 16:45:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dsjjs12
-- ----------------------------
DROP TABLE IF EXISTS `dsjjs12`;
CREATE TABLE `dsjjs12`  (
  `id` int NOT NULL,
  `stu_unit` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '软件技术系',
  `stu_class` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '21101+21102',
  `monday` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `tuseday` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `wednesday` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `thursday` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `friday` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `stu_unit`(`stu_unit` ASC) USING BTREE,
  INDEX `stu_class`(`stu_class` ASC) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of dsjjs12
-- ----------------------------
INSERT INTO `dsjjs12` VALUES (1, '大数据技术', '21101', '1', '0', '1', '1', '1');
INSERT INTO `dsjjs12` VALUES (2, '大数据技术', '21101', '1', '1', '0', '1', '0');
INSERT INTO `dsjjs12` VALUES (3, '大数据技术', '21101', '0', '1', '1', '1', '0');
INSERT INTO `dsjjs12` VALUES (4, '大数据技术', '21101', '1', '0', '1', '0', '0');
INSERT INTO `dsjjs12` VALUES (5, '大数据技术', '21101', '0', '0', '1', '0', '0');

-- ----------------------------
-- Table structure for dzsw12
-- ----------------------------
DROP TABLE IF EXISTS `dzsw12`;
CREATE TABLE `dzsw12`  (
  `id` int NOT NULL,
  `stu_unit` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '软件技术系',
  `stu_class` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '21101+21102',
  `monday` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `tuseday` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `wednesday` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `thursday` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `friday` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `stu_unit`(`stu_unit` ASC) USING BTREE,
  INDEX `stu_class`(`stu_class` ASC) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of dzsw12
-- ----------------------------
INSERT INTO `dzsw12` VALUES (1, '电子商务', '21101', '1', '1', '1', '0', '0');
INSERT INTO `dzsw12` VALUES (2, '电子商务', '21101', '1', '1', '1', '0', '0');
INSERT INTO `dzsw12` VALUES (3, '电子商务', '21101', '1', '0', '1', '0', '1');
INSERT INTO `dzsw12` VALUES (4, '电子商务', '21101', '0', '0', '1', '0', '1');
INSERT INTO `dzsw12` VALUES (5, '电子商务', '21101', '0', '0', '1', '0', '0');

-- ----------------------------
-- Table structure for encords
-- ----------------------------
DROP TABLE IF EXISTS `encords`;
CREATE TABLE `encords`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `stu_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '学生的学号，和user表student表相关联',
  `apply_unit` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '申请的单位（例：软件技术系）',
  `apply_day` date NOT NULL COMMENT '申请的日期（例：2023/4/9）',
  `apply_time` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '申请的时刻（例：第一大节）',
  `apply_stu_class` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '申请人的班级（例：21101班）',
  `apply_people_num` int NOT NULL COMMENT '学生人数',
  `apply_class_num` int NOT NULL COMMENT '需要的教室数量',
  `apply_class` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '申请的是哪个教室（例：A7-202）',
  `apply_user` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '申请人名字（例：刘启铭）',
  `apply_phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '申请人联系电话',
  `apply_reason` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '申请使用原因说明',
  `status` int NULL DEFAULT NULL COMMENT '当前申请的状态',
  `verify_code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '保安处验证码',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `stu_id`(`stu_id` ASC) USING BTREE,
  CONSTRAINT `encords_ibfk_1` FOREIGN KEY (`stu_id`) REFERENCES `students` (`stu_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of encords
-- ----------------------------
INSERT INTO `encords` VALUES (2, '21067010122', '软件技术', '2023-06-11', '[\"第一大节\"]', '21101', 41, 1, 'A7-202', '刘启铭', '13980194399', '上团课', 3, NULL);
INSERT INTO `encords` VALUES (3, '21067010122', '软件技术', '2023-06-12', '[\"第一大节\"]', '21101', 68, 1, 'A7-202', '刘启铭', '1380194399', '上团课', 2, '890493');
INSERT INTO `encords` VALUES (4, '21067010122', '软件技术', '2023-06-12', '[\"第一大节\"]', '21101', 59, 2, 'A7-101', '张三', '13980194399', '上团课', 3, NULL);
INSERT INTO `encords` VALUES (8, '21067011107', '软件技术', '2023-06-13', '[\"第一大节\"]', '21101', 40, 1, 'A7-202', '许清波', '12345678910', '上团课', 3, NULL);
INSERT INTO `encords` VALUES (11, '21067010122', '软件技术', '2023-06-13', '[\"第一大节\"]', '21101', 52, 1, 'A7-110', '张山', '13980194399', '上团课', 3, NULL);
INSERT INTO `encords` VALUES (12, '21067010122', '软件技术', '2023-06-12', '[\"第一大节\"]', '21101', 58, 1, 'A7-113', '张三', '13980194399', '上团课', 1, NULL);
INSERT INTO `encords` VALUES (13, '21067010122', '软件技术', '2023-06-13', '[\"第一大节\"]', '21101', 67, 1, 'A7-115', '刘五', '13980194399', '上团课', 2, '076269');
INSERT INTO `encords` VALUES (15, '21067010122', '软件技术', '2023-06-15', '[\"第四大节\"]', '21101', 50, 1, 'A7-207', '刘启铭', '13980194399', '上团课', 3, NULL);

-- ----------------------------
-- Table structure for friday
-- ----------------------------
DROP TABLE IF EXISTS `friday`;
CREATE TABLE `friday`  (
  `id` int NOT NULL COMMENT '序号',
  `position` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '哪个教室（例：A7-202）',
  `one` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第一大节（例：null）',
  `two` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第二大节（例：软件技术一班+软件技术二班）',
  `three` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第三大节（例：null）',
  `four` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第四大节（例：null）',
  `five` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第五大节（例：大数据技术一班+大数据技术二班）',
  `people_max` int NOT NULL COMMENT '该教室最大容纳人数',
  `type` int NOT NULL COMMENT '配置类型（有三类，1，2，3）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of friday
-- ----------------------------
INSERT INTO `friday` VALUES (1, 'A7-101', '1', '1', '0', '1', '1', 100, 1);
INSERT INTO `friday` VALUES (2, 'A7-102', '1', '1', '0', '1', '1', 100, 1);
INSERT INTO `friday` VALUES (3, 'A7-103', '1', '0', '1', '1', '1', 100, 1);
INSERT INTO `friday` VALUES (4, 'A7-104', '0', '1', '1', '1', '0', 100, 1);
INSERT INTO `friday` VALUES (5, 'A7-105', '1', '1', '1', '0', '0', 100, 1);
INSERT INTO `friday` VALUES (6, 'A7-106', '1', '1', '1', '0', '0', 100, 1);
INSERT INTO `friday` VALUES (7, 'A7-107', '1', '0', '1', '1', '0', 100, 1);
INSERT INTO `friday` VALUES (8, 'A7-108', '0', '1', '1', '1', '0', 100, 1);
INSERT INTO `friday` VALUES (9, 'A7-109', '1', '0', '1', '0', '1', 100, 1);
INSERT INTO `friday` VALUES (10, 'A7-110', '1', '1', '1', '0', '0', 100, 1);
INSERT INTO `friday` VALUES (11, 'A7-201', '1', '0', '1', '1', '1', 50, 1);
INSERT INTO `friday` VALUES (12, 'A7-202', '1', '0', '1', '0', '1', 50, 1);
INSERT INTO `friday` VALUES (13, 'A7-203', '0', '1', '1', '1', '1', 50, 1);
INSERT INTO `friday` VALUES (14, 'A7-204', '1', '0', '1', '1', '1', 50, 1);
INSERT INTO `friday` VALUES (15, 'A7-205', '0', '1', '1', '1', '0', 50, 1);
INSERT INTO `friday` VALUES (16, 'A7-206', '1', '1', '0', '1', '1', 50, 1);
INSERT INTO `friday` VALUES (17, 'A7-207', '1', '1', '0', '1', '1', 50, 1);
INSERT INTO `friday` VALUES (18, 'A7-208', '1', '0', '1', '0', '1', 50, 1);
INSERT INTO `friday` VALUES (19, 'A7-209', '1', '0', '1', '0', '1', 50, 1);
INSERT INTO `friday` VALUES (50, 'A7-210', '0', '1', '0', '1', '1', 50, 1);

-- ----------------------------
-- Table structure for monday
-- ----------------------------
DROP TABLE IF EXISTS `monday`;
CREATE TABLE `monday`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '序号',
  `position` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '哪个教室（例：A7-202）',
  `one` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第一大节（例：null）',
  `two` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第二大节（例：软件技术一班+软件技术二班）',
  `three` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第三大节（例：null）',
  `four` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第四大节（例：null）',
  `five` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第五大节（例：大数据技术一班+大数据技术二班）',
  `people_max` int NOT NULL COMMENT '该教室最大容纳人数',
  `type` int NOT NULL COMMENT '配置类型（有三类，1，2，3）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of monday
-- ----------------------------
INSERT INTO `monday` VALUES (1, 'A7-101', '1', '1', '0', '1', '0', 100, 1);
INSERT INTO `monday` VALUES (2, 'A7-102', '0', '1', '1', '1', '0', 100, 1);
INSERT INTO `monday` VALUES (3, 'A7-103', '1', '0', '1', '1', '1', 100, 1);
INSERT INTO `monday` VALUES (4, 'A7-104', '1', '1', '1', '0', '0', 100, 1);
INSERT INTO `monday` VALUES (5, 'A7-105', '1', '1', '0', '1', '1', 100, 1);
INSERT INTO `monday` VALUES (6, 'A7-106', '1', '1', '0', '0', '1', 100, 1);
INSERT INTO `monday` VALUES (7, 'A7-107', '0', '0', '1', '1', '1', 100, 1);
INSERT INTO `monday` VALUES (8, 'A7-108', '1', '1', '1', '1', '1', 100, 1);
INSERT INTO `monday` VALUES (9, 'A7-109', '0', '1', '1', '1', '0', 100, 1);
INSERT INTO `monday` VALUES (10, 'A7-110', '1', '0', '1', '1', '0', 100, 1);
INSERT INTO `monday` VALUES (11, 'A7-201', '1', '1', '1', '0', '0', 50, 1);
INSERT INTO `monday` VALUES (12, 'A7-202', '1', '0', '1', '0', '1', 50, 1);
INSERT INTO `monday` VALUES (13, 'A7-203', '1', '0', '1', '1', '0', 50, 1);
INSERT INTO `monday` VALUES (14, 'A7-204', '0', '1', '1', '1', '0', 50, 1);
INSERT INTO `monday` VALUES (15, 'A7-205', '1', '1', '0', '1', '0', 50, 1);
INSERT INTO `monday` VALUES (16, 'A7-206', '1', '1', '0', '0', '1', 50, 1);
INSERT INTO `monday` VALUES (17, 'A7-207', '0', '1', '1', '1', '0', 50, 1);
INSERT INTO `monday` VALUES (18, 'A7-208', '1', '0', '1', '0', '1', 50, 1);
INSERT INTO `monday` VALUES (19, 'A7-209', '0', '1', '1', '0', '0', 50, 1);
INSERT INTO `monday` VALUES (20, 'A7-210', '1', '0', '1', '0', '1', 50, 1);

-- ----------------------------
-- Table structure for rjjs12
-- ----------------------------
DROP TABLE IF EXISTS `rjjs12`;
CREATE TABLE `rjjs12`  (
  `id` int NOT NULL,
  `stu_unit` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '软件技术系',
  `stu_class` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '21101+21102',
  `monday` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `tuseday` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `wednesday` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `thursday` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `friday` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `stu_unit`(`stu_unit` ASC) USING BTREE,
  INDEX `stu_class`(`stu_class` ASC) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of rjjs12
-- ----------------------------
INSERT INTO `rjjs12` VALUES (1, '软件技术', '21101', '0', '1', '1', '0', '1');
INSERT INTO `rjjs12` VALUES (2, '软件技术', '21101', '0', '1', '1', '0', '1');
INSERT INTO `rjjs12` VALUES (3, '软件技术', '21101', '0', '1', '0', '1', '0');
INSERT INTO `rjjs12` VALUES (4, '软件技术', '21101', '0', '0', '0', '1', '0');
INSERT INTO `rjjs12` VALUES (5, '软件技术', '21101', '1', '0', '0', '0', '0');

-- ----------------------------
-- Table structure for rjjs34
-- ----------------------------
DROP TABLE IF EXISTS `rjjs34`;
CREATE TABLE `rjjs34`  (
  `id` int NOT NULL,
  `stu_unit` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '软件技术系',
  `stu_class` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '21101+21102',
  `monday` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `tuseday` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `wednesday` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `thursday` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `friday` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `stu_unit`(`stu_unit` ASC) USING BTREE,
  INDEX `stu_class`(`stu_class` ASC) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of rjjs34
-- ----------------------------
INSERT INTO `rjjs34` VALUES (1, '软件技术', '21103', '1', '1', '0', '1', '1');
INSERT INTO `rjjs34` VALUES (2, '软件技术', '21103', '1', '1', '0', '1', '1');
INSERT INTO `rjjs34` VALUES (3, '软件技术', '21103', '1', '1', '1', '0', '1');
INSERT INTO `rjjs34` VALUES (4, '软件技术', '21103', '0', '0', '1', '0', '1');
INSERT INTO `rjjs34` VALUES (5, '软件技术', '21103', '0', '0', '0', '1', '0');

-- ----------------------------
-- Table structure for students
-- ----------------------------
DROP TABLE IF EXISTS `students`;
CREATE TABLE `students`  (
  `id` int NOT NULL,
  `stu_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '21067010122',
  `stu_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '刘启铭',
  `stu_unit` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '软件技术系',
  `stu_class` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '21101',
  PRIMARY KEY (`stu_id`) USING BTREE,
  INDEX `stu_id`(`stu_id` ASC) USING BTREE,
  INDEX `stu_unit`(`stu_unit` ASC, `stu_class` ASC) USING BTREE,
  INDEX `stu_unit_2`(`stu_unit` ASC) USING BTREE,
  INDEX `stu_class`(`stu_class` ASC) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of students
-- ----------------------------
INSERT INTO `students` VALUES (6, '21067010108', '张艺貌', '软件技术', '21101');
INSERT INTO `students` VALUES (3, '21067010116', '朱虹荣', '软件技术', '21101');
INSERT INTO `students` VALUES (4, '21067010117', '舒宏洋', '软件技术', '21101');
INSERT INTO `students` VALUES (5, '21067010118', '蒋文均', '软件技术', '21101');
INSERT INTO `students` VALUES (1, '21067010122', '刘启铭', '软件技术', '21101');
INSERT INTO `students` VALUES (2, '21067010226', '柳猛', '软件技术', '21102');
INSERT INTO `students` VALUES (9, '21067010301', '李金秋', '软件技术', '21103');
INSERT INTO `students` VALUES (7, '21067011107', '许清波', '大数据技术', '21101');
INSERT INTO `students` VALUES (8, '21067012107', '张三', '电子商务', '21101');

-- ----------------------------
-- Table structure for thursday
-- ----------------------------
DROP TABLE IF EXISTS `thursday`;
CREATE TABLE `thursday`  (
  `id` int NOT NULL COMMENT '序号',
  `position` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '哪个教室（例：A7-202）',
  `one` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第一大节（例：null）',
  `two` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第二大节（例：软件技术一班+软件技术二班）',
  `three` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第三大节（例：null）',
  `four` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第四大节（例：null）',
  `five` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第五大节（例：大数据技术一班+大数据技术二班）',
  `people_max` int NOT NULL COMMENT '该教室最大容纳人数',
  `type` int NOT NULL COMMENT '配置类型（有三类，1，2，3）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of thursday
-- ----------------------------
INSERT INTO `thursday` VALUES (1, 'A7-101', '1', '0', '1', '1', '0', 100, 1);
INSERT INTO `thursday` VALUES (2, 'A7-102', '1', '0', '1', '1', '1', 100, 1);
INSERT INTO `thursday` VALUES (3, 'A7-103', '1', '1', '1', '0', '1', 100, 1);
INSERT INTO `thursday` VALUES (4, 'A7-104', '1', '1', '0', '1', '1', 100, 1);
INSERT INTO `thursday` VALUES (5, 'A7-105', '1', '0', '1', '0', '1', 100, 1);
INSERT INTO `thursday` VALUES (6, 'A7-106', '1', '1', '0', '1', '1', 100, 1);
INSERT INTO `thursday` VALUES (7, 'A7-107', '0', '1', '1', '1', '0', 100, 1);
INSERT INTO `thursday` VALUES (8, 'A7-108', '1', '1', '1', '0', '1', 100, 1);
INSERT INTO `thursday` VALUES (9, 'A7-109', '1', '1', '0', '1', '1', 100, 1);
INSERT INTO `thursday` VALUES (10, 'A7-110', '1', '0', '1', '0', '1', 100, 1);
INSERT INTO `thursday` VALUES (11, 'A7-201', '1', '1', '0', '0', '1', 50, 1);
INSERT INTO `thursday` VALUES (12, 'A7-202', '0', '1', '0', '1', '1', 50, 1);
INSERT INTO `thursday` VALUES (13, 'A7-203', '1', '0', '1', '0', '1', 50, 1);
INSERT INTO `thursday` VALUES (14, 'A7-204', '1', '0', '1', '1', '1', 50, 1);
INSERT INTO `thursday` VALUES (15, 'A7-205', '1', '1', '0', '1', '1', 50, 1);
INSERT INTO `thursday` VALUES (16, 'A7-206', '1', '1', '0', '1', '1', 50, 1);
INSERT INTO `thursday` VALUES (17, 'A7-207', '1', '0', '1', '1', '1', 50, 1);
INSERT INTO `thursday` VALUES (18, 'A7-208', '0', '1', '1', '1', '0', 50, 1);
INSERT INTO `thursday` VALUES (19, 'A7-209', '1', '0', '1', '0', '1', 50, 1);
INSERT INTO `thursday` VALUES (20, 'A7-210', '1', '0', '1', '1', '1', 50, 1);

-- ----------------------------
-- Table structure for tuesday
-- ----------------------------
DROP TABLE IF EXISTS `tuesday`;
CREATE TABLE `tuesday`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '序号',
  `position` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '哪个教室（例：A7-202）',
  `one` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第一大节（例：null）',
  `two` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第二大节（例：软件技术一班+软件技术二班）',
  `three` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第三大节（例：null）',
  `four` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第四大节（例：null）',
  `five` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第五大节（例：大数据技术一班+大数据技术二班）',
  `people_max` int NOT NULL COMMENT '该教室最大容纳人数',
  `type` int NOT NULL COMMENT '配置类型（有三类，1，2，3）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of tuesday
-- ----------------------------
INSERT INTO `tuesday` VALUES (1, 'A7-101', '1', '0', '1', '0', '1', 100, 1);
INSERT INTO `tuesday` VALUES (2, 'A7-102', '1', '1', '1', '0', '0', 100, 1);
INSERT INTO `tuesday` VALUES (3, 'A7-103', '0', '1', '1', '1', '0', 100, 1);
INSERT INTO `tuesday` VALUES (4, 'A7-104', '1', '1', '0', '1', '0', 100, 1);
INSERT INTO `tuesday` VALUES (5, 'A7-105', '0', '1', '0', '0', '1', 100, 1);
INSERT INTO `tuesday` VALUES (6, 'A7-106', '1', '0', '1', '0', '1', 100, 1);
INSERT INTO `tuesday` VALUES (7, 'A7-107', '0', '0', '1', '0', '1', 100, 1);
INSERT INTO `tuesday` VALUES (8, 'A7-108', '1', '1', '1', '1', '1', 100, 1);
INSERT INTO `tuesday` VALUES (9, 'A7-109', '1', '1', '1', '0', '0', 100, 1);
INSERT INTO `tuesday` VALUES (10, 'A7-110', '1', '1', '1', '1', '0', 100, 1);
INSERT INTO `tuesday` VALUES (11, 'A7-201', '1', '1', '1', '1', '0', 50, 1);
INSERT INTO `tuesday` VALUES (12, 'A7-202', '1', '1', '1', '0', '0', 50, 1);
INSERT INTO `tuesday` VALUES (13, 'A7-203', '1', '1', '1', '0', '0', 50, 1);
INSERT INTO `tuesday` VALUES (14, 'A7-204', '1', '1', '1', '0', '1', 50, 1);
INSERT INTO `tuesday` VALUES (15, 'A7-205', '1', '1', '1', '0', '0', 50, 1);
INSERT INTO `tuesday` VALUES (16, 'A7-206', '1', '1', '1', '0', '0', 50, 1);
INSERT INTO `tuesday` VALUES (17, 'A7-207', '0', '1', '1', '1', '0', 50, 1);
INSERT INTO `tuesday` VALUES (18, 'A7-208', '1', '1', '1', '0', '1', 50, 1);
INSERT INTO `tuesday` VALUES (19, 'A7-209', '0', '1', '1', '1', '1', 50, 1);
INSERT INTO `tuesday` VALUES (20, 'A7-210', '1', '1', '0', '1', '1', 50, 1);

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `pwd` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `stu_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `type` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `stu_mail` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `verCode` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `stu_id`(`stu_id` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, '21067010122', '323104', '21067010122', '4', '13980194399', '3231045496@qq.com', '259431');
INSERT INTO `users` VALUES (2, '21067010118', '323104', '21067010118', '1', '13980194399', '3231045496@qq.com', '259431');
INSERT INTO `users` VALUES (3, '21067010117', '323104', '21067010117', '2', '13980194399', '2325656876@qq.com', '891202');
INSERT INTO `users` VALUES (4, '21067010226', '323104', '21067010226', '4', '13980194399', '3231045496@qq.com', '259431');
INSERT INTO `users` VALUES (5, '21067010116', '323104', '21067010116', '3', '13980194399', '3231045496@qq.com', '259431');
INSERT INTO `users` VALUES (6, '21067010108', '323104', '21067010108', '1', '13980194399', '3231045496@qq.com', '259431');
INSERT INTO `users` VALUES (11, '21067010140', '323104', '', '1', NULL, '2325656876@qq.com', '891202');
INSERT INTO `users` VALUES (12, '21067010140', '323104', '21067010140', '1', NULL, '3231045496@qq.com', '259431');
INSERT INTO `users` VALUES (13, '21067010133', '323104', '21067010133', '1', NULL, '3231045496@qq.com', '259431');
INSERT INTO `users` VALUES (14, '21067010122', '323104', '21067010122', '1', NULL, '3231045496@qq.com', '259431');
INSERT INTO `users` VALUES (15, '21067010188', '323104', '21067010188', '1', NULL, '3231045496@qq.com', '259431');

-- ----------------------------
-- Table structure for wednesday
-- ----------------------------
DROP TABLE IF EXISTS `wednesday`;
CREATE TABLE `wednesday`  (
  `id` int NOT NULL COMMENT '序号',
  `position` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '哪个教室（例：A7-202）',
  `one` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第一大节（例：null）',
  `two` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第二大节（例：软件技术一班+软件技术二班）',
  `three` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第三大节（例：null）',
  `four` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第四大节（例：null）',
  `five` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '第五大节（例：大数据技术一班+大数据技术二班）',
  `people_max` int NOT NULL COMMENT '该教室最大容纳人数',
  `type` int NOT NULL COMMENT '配置类型（有三类，1，2，3）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of wednesday
-- ----------------------------
INSERT INTO `wednesday` VALUES (1, 'A7-101', '1', '1', '1', '0', '1', 100, 1);
INSERT INTO `wednesday` VALUES (2, 'A7-102', '1', '0', '1', '0', '1', 100, 1);
INSERT INTO `wednesday` VALUES (3, 'A7-103', '1', '1', '0', '1', '0', 100, 1);
INSERT INTO `wednesday` VALUES (4, 'A7-104', '0', '1', '0', '1', '0', 100, 1);
INSERT INTO `wednesday` VALUES (5, 'A7-105', '1', '1', '1', '0', '1', 100, 1);
INSERT INTO `wednesday` VALUES (6, 'A7-106', '1', '1', '0', '1', '1', 100, 1);
INSERT INTO `wednesday` VALUES (7, 'A7-107', '1', '0', '1', '0', '1', 100, 1);
INSERT INTO `wednesday` VALUES (8, 'A7-108', '1', '0', '1', '0', '1', 100, 1);
INSERT INTO `wednesday` VALUES (9, 'A7-109', '1', '0', '1', '0', '1', 100, 1);
INSERT INTO `wednesday` VALUES (10, 'A7-110', '1', '0', '1', '0', '1', 100, 1);
INSERT INTO `wednesday` VALUES (11, 'A7-201', '1', '0', '1', '1', '1', 50, 1);
INSERT INTO `wednesday` VALUES (12, 'A7-202', '1', '1', '1', '0', '0', 50, 1);
INSERT INTO `wednesday` VALUES (13, 'A7-203', '1', '1', '0', '1', '1', 50, 1);
INSERT INTO `wednesday` VALUES (14, 'A7-204', '1', '1', '1', '0', '1', 50, 1);
INSERT INTO `wednesday` VALUES (15, 'A7-205', '1', '0', '1', '1', '0', 50, 1);
INSERT INTO `wednesday` VALUES (16, 'A7-206', '0', '1', '1', '1', '0', 50, 1);
INSERT INTO `wednesday` VALUES (17, 'A7-207', '1', '0', '1', '1', '0', 50, 1);
INSERT INTO `wednesday` VALUES (18, 'A7-208', '0', '1', '1', '1', '0', 50, 1);
INSERT INTO `wednesday` VALUES (19, 'A7-209', '1', '1', '0', '1', '1', 50, 1);
INSERT INTO `wednesday` VALUES (20, 'A7-210', '1', '0', '1', '0', '1', 100, 1);

SET FOREIGN_KEY_CHECKS = 1;
