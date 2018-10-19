CREATE DATABASE  IF NOT EXISTS `jellyartz` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `jellyartz`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: jellyartz
-- ------------------------------------------------------
-- Server version	5.6.40-log

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
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category` (
  `CATEGORY_ID` int(10) NOT NULL AUTO_INCREMENT,
  `CATEGORY_NAME` varchar(120) NOT NULL,
  `CATEGORY_DESC` varchar(250) NOT NULL,
  `CREATED_BY` varchar(50) DEFAULT NULL,
  `CREATED_ON` date DEFAULT NULL,
  `CHANGED_BY` varchar(50) DEFAULT NULL,
  `CHANGED_ON` date DEFAULT NULL,
  PRIMARY KEY (`CATEGORY_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1 COMMENT='THIS TABLE IS FOR PRODUCT CATEGORIES';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'PHENOL','PHENOL ALCOHOL MOLECULES',NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ordered_products`
--

DROP TABLE IF EXISTS `ordered_products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ordered_products` (
  `ORDER_PRODUCT_ID` int(10) NOT NULL AUTO_INCREMENT,
  `PRODUCT_ID` int(10) NOT NULL,
  `ORDER_ID` int(10) NOT NULL,
  `QUANTITY` int(100) NOT NULL,
  `CREATED_BY` varchar(120) DEFAULT NULL,
  `CREATED_ON` date DEFAULT NULL,
  `CHANGED_BY` varchar(120) DEFAULT NULL,
  `CHANGED_ON` date DEFAULT NULL,
  PRIMARY KEY (`ORDER_PRODUCT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordered_products`
--

LOCK TABLES `ordered_products` WRITE;
/*!40000 ALTER TABLE `ordered_products` DISABLE KEYS */;
/*!40000 ALTER TABLE `ordered_products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `ORDER_ID` int(10) NOT NULL AUTO_INCREMENT,
  `ORDER_CUST_ID` int(10) DEFAULT NULL,
  `ORDER_DESC` varchar(250) DEFAULT NULL,
  `CREATED_BY` varchar(50) DEFAULT NULL,
  `CREATED_ON` date DEFAULT NULL,
  `CHANGED_BY` varchar(50) DEFAULT NULL,
  `CHANGED_ON` date DEFAULT NULL,
  PRIMARY KEY (`ORDER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `products` (
  `PRODUCT_ID` int(10) NOT NULL,
  `PRODUCT_NAME` varchar(250) NOT NULL,
  `PRODUCT_DESC` varchar(500) DEFAULT NULL,
  `PRODUCT_STRUCTURE` mediumblob,
  `PRODUCT_FORMULA` longtext,
  `PRODUCT_PRICE` decimal(10,2) DEFAULT NULL,
  `PRODUCT_CATEGORY_ID` int(10) NOT NULL,
  `CREATED_BY` varchar(120) DEFAULT NULL,
  `CREATED_ON` date DEFAULT NULL,
  `CHANGED_BY` varchar(120) DEFAULT NULL,
  `CHANGED_ON` date DEFAULT NULL,
  PRIMARY KEY (`PRODUCT_ID`),
  KEY `CATEGORY_ID_idx` (`PRODUCT_CATEGORY_ID`),
  CONSTRAINT `CATEGORY_ID` FOREIGN KEY (`PRODUCT_CATEGORY_ID`) REFERENCES `category` (`CATEGORY_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `USER_ID` int(10) NOT NULL AUTO_INCREMENT,
  `FIRST_NAME` varchar(120) NOT NULL,
  `LAST_NAME` varchar(120) NOT NULL,
  `EMAIL` varchar(120) NOT NULL,
  `PASSWORD` varchar(120) NOT NULL,
  `COMPANY_NAME` varchar(200) DEFAULT NULL,
  `COMPANY_TAX_NO` varchar(100) DEFAULT NULL,
  `STREET_ADDRESS` varchar(250) NOT NULL,
  `CITY` varchar(200) NOT NULL,
  `STATE` varchar(100) NOT NULL,
  `ZIPCODE` varchar(50) NOT NULL,
  `COUNTRY` varchar(200) NOT NULL,
  `TELEPHONE_NUMBER` varchar(100) NOT NULL,
  `FAX_NUMBER` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1 COMMENT='THIS TABLE STORES THE DATA OF THE USERS';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Joseph','William','joseph@jellyartz.com','hello','JellyArtz','JLY234ER','New Jersey','LA','LA','10043','United States','0602186345','FCUUY2');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-19 22:17:33
