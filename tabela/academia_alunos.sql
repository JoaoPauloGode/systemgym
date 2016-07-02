-- MySQL dump 10.13  Distrib 5.7.9, for Win32 (AMD64)
--
-- Host: 127.0.0.1    Database: academia
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.13-MariaDB

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
-- Table structure for table `alunos`
--

DROP TABLE IF EXISTS `alunos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `alunos` (
  `nome` varchar(200) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `endereco` varchar(500) NOT NULL,
  `cpf` varchar(20) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `saldoDevedor` double NOT NULL,
  `dataCadastro` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `cpf_UNIQUE` (`cpf`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alunos`
--

LOCK TABLES `alunos` WRITE;
/*!40000 ALTER TABLE `alunos` DISABLE KEYS */;
INSERT INTO `alunos` VALUES ('João Paulo Godê Liberal','00000000000','BB','10731087402',9,45504,''),('Junior','44444444444','aa','77777777777',10,80,''),('renata','11111111111','aaa','22222221111',11,0,''),('pedrosss2','45454545457','asas','78754454545',13,0,''),('kk','55555555555','kk','55552252525',14,0,''),('a','11111111111','a','55854546565',15,0,''),('bv','00000054545','asa','45784545454',16,0,''),('jkjk','45454545454','jjkjkj','44545454545',17,0,''),('asas','45454545454','asas','85858585858',18,0,''),('jkjk','45454545454','sasas','45454545454',19,0,''),('Cicero Liberal','87988654523','Iguaraci','68861478468',20,15,''),('testedata','11111111111','ads','12155455454',21,0,'00000000'),('testador','00000000000','assss','66666666666',22,0,'12121212'),('aluno mensalidade','11111111111','kkkk','99999999900',23,0,'33333333'),('João teste Cadastro','45455545454','nsmans','45744455454',24,0,'26062016');
/*!40000 ALTER TABLE `alunos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-07-02 15:26:52
