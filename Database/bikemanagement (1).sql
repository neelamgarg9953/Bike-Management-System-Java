-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: localhost    Database: bikemanagement
-- ------------------------------------------------------
-- Server version	8.0.37

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `username` varchar(50) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `password` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('admin','neelam','admin');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `adminmodule`
--

DROP TABLE IF EXISTS `adminmodule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `adminmodule` (
  `name` varchar(50) DEFAULT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adminmodule`
--

LOCK TABLES `adminmodule` WRITE;
/*!40000 ALTER TABLE `adminmodule` DISABLE KEYS */;
/*!40000 ALTER TABLE `adminmodule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bike`
--

DROP TABLE IF EXISTS `bike`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bike` (
  `Bike_ID` varchar(50) DEFAULT NULL,
  `Bike_Name` varchar(50) DEFAULT NULL,
  `Model` varchar(10) DEFAULT NULL,
  `Color` varchar(10) DEFAULT NULL,
  `Bike_Type` varchar(50) DEFAULT NULL,
  `Price` varchar(20) DEFAULT NULL,
  `Terminal_ID` varchar(20) DEFAULT NULL,
  `Availability` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bike`
--

LOCK TABLES `bike` WRITE;
/*!40000 ALTER TABLE `bike` DISABLE KEYS */;
/*!40000 ALTER TABLE `bike` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bike_booking`
--

DROP TABLE IF EXISTS `bike_booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bike_booking` (
  `booking_id` varchar(10) NOT NULL,
  `customer_username` varchar(50) DEFAULT NULL,
  `customer_name` varchar(50) DEFAULT NULL,
  `customer_phone` varchar(50) DEFAULT NULL,
  `brand_name` varchar(50) DEFAULT NULL,
  `brand_model` varchar(50) DEFAULT NULL,
  `bike_no` varchar(50) DEFAULT NULL,
  `bike_name` varchar(50) DEFAULT NULL,
  `bike_sheet` varchar(50) DEFAULT NULL,
  `bike_engine` varchar(50) DEFAULT NULL,
  `bike_category` varchar(50) DEFAULT NULL,
  `bike_mileage` varchar(50) DEFAULT NULL,
  `bike_mirror` varchar(50) DEFAULT NULL,
  `bike_rent` int DEFAULT NULL,
  `total_days` int DEFAULT NULL,
  `booking_date` varchar(50) DEFAULT NULL,
  `booking_status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`booking_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bike_booking`
--

LOCK TABLES `bike_booking` WRITE;
/*!40000 ALTER TABLE `bike_booking` DISABLE KEYS */;
/*!40000 ALTER TABLE `bike_booking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bike_module`
--

DROP TABLE IF EXISTS `bike_module`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bike_module` (
  `bike_no` varchar(10) NOT NULL,
  `brand_name` varchar(50) DEFAULT NULL,
  `brand_model` varchar(50) DEFAULT NULL,
  `bike_name` varchar(50) DEFAULT NULL,
  `bike_sheet` varchar(50) DEFAULT NULL,
  `bike_engine` varchar(50) DEFAULT NULL,
  `bike_category` varchar(50) DEFAULT NULL,
  `bike_mielage` varchar(50) DEFAULT NULL,
  `bike_mirror` varchar(50) DEFAULT NULL,
  `bike_rent` int DEFAULT NULL,
  `bike_status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`bike_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bike_module`
--

LOCK TABLES `bike_module` WRITE;
/*!40000 ALTER TABLE `bike_module` DISABLE KEYS */;
/*!40000 ALTER TABLE `bike_module` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bikebrand`
--

DROP TABLE IF EXISTS `bikebrand`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bikebrand` (
  `brand_id` varchar(10) DEFAULT NULL,
  `brand_name` varchar(20) DEFAULT NULL,
  `bike_model` varchar(20) DEFAULT NULL,
  `year` varchar(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bikebrand`
--

LOCK TABLES `bikebrand` WRITE;
/*!40000 ALTER TABLE `bikebrand` DISABLE KEYS */;
/*!40000 ALTER TABLE `bikebrand` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment` (
  `Bike_ID` varchar(20) NOT NULL,
  `Cost` decimal(10,2) DEFAULT NULL,
  `Mode_of_Payment` varchar(10) DEFAULT NULL,
  `Receipt_no` varchar(10) DEFAULT NULL,
  `Payment_Date` date DEFAULT NULL,
  PRIMARY KEY (`Bike_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transcation`
--

DROP TABLE IF EXISTS `transcation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transcation` (
  `Email` varchar(30) DEFAULT NULL,
  `Bike_ID` varchar(20) NOT NULL,
  `Start_Time` varchar(10) DEFAULT NULL,
  `End_Time` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Bike_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transcation`
--

LOCK TABLES `transcation` WRITE;
/*!40000 ALTER TABLE `transcation` DISABLE KEYS */;
/*!40000 ALTER TABLE `transcation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `user_id` varchar(50) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(16) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `father_name` varchar(50) DEFAULT NULL,
  `phone` varchar(10) DEFAULT NULL,
  `qualification` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `blood` varchar(50) DEFAULT NULL,
  `age` varchar(50) DEFAULT NULL,
  `dob` varchar(50) DEFAULT NULL,
  `driving_lic` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('44619','abc','abc_123','12345','abc@gmail.com','xyz','1230456700','bca','delhi','Female','B','23','20-12-2003','Yes','Faridabad'),('11566','Neelam garg','ngarg','123456789','ngarg@gmail.com','Ram niwas garg','9638521470','12th','Delhi','Female','A','20','20-07-2002','Yes','Ghaziabad');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
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

-- Dump completed on 2026-07-17 19:22:07
