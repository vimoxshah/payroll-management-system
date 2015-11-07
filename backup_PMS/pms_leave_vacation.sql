-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: pms
-- ------------------------------------------------------
-- Server version	5.6.22-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `leave_vacation`
--

DROP TABLE IF EXISTS `leave_vacation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `leave_vacation` (
  `emp_id_vac` varchar(45) NOT NULL,
  `jan` varchar(45) DEFAULT '0',
  `feb` varchar(45) DEFAULT '0',
  `mar` varchar(45) DEFAULT '0',
  `apr` varchar(45) DEFAULT '0',
  `may` varchar(45) DEFAULT '0',
  `june` varchar(45) DEFAULT '0',
  `july` varchar(45) DEFAULT '0',
  `aug` varchar(45) DEFAULT '0',
  `sept` varchar(45) DEFAULT '0',
  `oct` varchar(45) DEFAULT '0',
  `nov` varchar(45) DEFAULT '0',
  `decm` varchar(45) DEFAULT '0',
  `total_vac` varchar(45) DEFAULT '0',
  KEY `emp_id_vac_idx` (`emp_id_vac`),
  CONSTRAINT `emp_id_vac` FOREIGN KEY (`emp_id_vac`) REFERENCES `employee` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `leave_vacation`
--

LOCK TABLES `leave_vacation` WRITE;
/*!40000 ALTER TABLE `leave_vacation` DISABLE KEYS */;
INSERT INTO `leave_vacation` VALUES ('1001','1','01','05','03','05','04','01','01','02','03','05','04','35'),('1002','0','0','0','0','0','0','0','0','0','0','0','0','0'),('1003','0','0','0','0','0','0','0','0','0','0','0','0','0'),('1004','0','0','0','0','0','0','0','0','0','0','0','0','0'),('1005','0','0','0','0','0','0','0','0','0','0','0','0','0');
/*!40000 ALTER TABLE `leave_vacation` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-11-07 17:39:36
