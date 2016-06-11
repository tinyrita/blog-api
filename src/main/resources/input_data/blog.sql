-- MySQL dump 10.16  Distrib 10.1.13-MariaDB, for Linux (x86_64)
--
-- Host: anasit.com    Database: blog
-- ------------------------------------------------------
-- Server version	10.0.23-MariaDB-0+deb8u1

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
-- Table structure for table `blogarticle`
--

DROP TABLE IF EXISTS `blogarticle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `blogarticle` (
  `blogID` bigint(20) NOT NULL AUTO_INCREMENT,
  `bloggerID` int(11) NOT NULL,
  `blogTitle` varchar(255) DEFAULT NULL,
  `blogContent` longtext,
  `publishTime` datetime NOT NULL,
  PRIMARY KEY (`blogID`),
  KEY `bloggerID` (`bloggerID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blogarticle`
--

LOCK TABLES `blogarticle` WRITE;
/*!40000 ALTER TABLE `blogarticle` DISABLE KEYS */;
INSERT INTO `blogarticle` VALUES (1,7,'我的新博客发布了,我每天都会发一篇同样的博','欢迎大家观看','0000-00-00 00:00:00'),(2,7,'我的新博客发布了,我每天都会发一篇同样的博','欢迎大家观看','0000-00-00 00:00:00'),(3,7,'我的新博客发布了,我每天都会发一篇同样的博','欢迎大家观看','0000-00-00 00:00:00'),(4,7,'我的新博客发布了,我每天都会发一篇同样的博','欢迎大家观看','0000-00-00 00:00:00'),(5,7,'我的新博客发布了,我每天都会发一篇同样的博','欢迎大家观看','0000-00-00 00:00:00'),(6,7,'我的新博客发布了,我每天都会发一篇同样的博','欢迎大家观看','0000-00-00 00:00:00'),(7,7,'我的新博客发布了,我每天都会发一篇同样的博','欢迎大家观看','0000-00-00 00:00:00'),(8,7,'我的新博客发布了,我每天都会发一篇同样的博','欢迎大家观看','0000-00-00 00:00:00'),(9,7,'我的新博客发布了,我每天都会发一篇同样的博','欢迎大家观看','0000-00-00 00:00:00'),(10,7,'我的新博客发布了,我每天都会发一篇同样的博','欢迎大家观看','0000-00-00 00:00:00');
/*!40000 ALTER TABLE `blogarticle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bloguser`
--

DROP TABLE IF EXISTS `bloguser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bloguser` (
  `userID` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) NOT NULL,
  `pwd` varchar(20) NOT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `powerID` tinyint(4) NOT NULL,
  PRIMARY KEY (`userID`),
  KEY `powerID` (`powerID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bloguser`
--

LOCK TABLES `bloguser` WRITE;
/*!40000 ALTER TABLE `bloguser` DISABLE KEYS */;
/*!40000 ALTER TABLE `bloguser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comment` (
  `commentID` bigint(20) NOT NULL AUTO_INCREMENT,
  `guestID` int(11) NOT NULL,
  `blogArticleID` bigint(20) NOT NULL,
  `comment` text,
  `commentTime` datetime NOT NULL,
  PRIMARY KEY (`commentID`),
  KEY `guestID` (`guestID`),
  KEY `blogArticleID` (`blogArticleID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comment`
--

LOCK TABLES `comment` WRITE;
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `friends`
--

DROP TABLE IF EXISTS `friends`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `friends` (
  `myID` int(11) NOT NULL,
  `friendID` int(11) NOT NULL,
  `addFriendDate` datetime NOT NULL,
  PRIMARY KEY (`myID`,`friendID`),
  KEY `friendID` (`friendID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `friends`
--

LOCK TABLES `friends` WRITE;
/*!40000 ALTER TABLE `friends` DISABLE KEYS */;
/*!40000 ALTER TABLE `friends` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-06-12  4:05:19
