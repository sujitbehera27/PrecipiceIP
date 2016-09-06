-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.5.45 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             9.3.0.5107
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for precipiceip
DROP DATABASE IF EXISTS `precipiceip`;
CREATE DATABASE IF NOT EXISTS `precipiceip` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `precipiceip`;

-- Dumping structure for table precipiceip.bus_det
DROP TABLE IF EXISTS `bus_det`;
CREATE TABLE IF NOT EXISTS `bus_det` (
  `BUSINESS_DETAILS_ID` int(11) NOT NULL AUTO_INCREMENT,
  `COMP_OVERALL` varchar(300) NOT NULL,
  `COMP_BY_BU` varchar(300) NOT NULL,
  `COMP_MARK_ACTIVITY` varchar(300) NOT NULL,
  `COMP_IP_POLICY` tinyint(1) NOT NULL,
  `COMP_IP_STRATEGY` tinyint(1) NOT NULL,
  `BUSINESS_STRATEGY` tinyint(1) NOT NULL,
  PRIMARY KEY (`BUSINESS_DETAILS_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Dumping data for table precipiceip.bus_det: ~2 rows (approximately)
DELETE FROM `bus_det`;
/*!40000 ALTER TABLE `bus_det` DISABLE KEYS */;
INSERT INTO `bus_det` (`BUSINESS_DETAILS_ID`, `COMP_OVERALL`, `COMP_BY_BU`, `COMP_MARK_ACTIVITY`, `COMP_IP_POLICY`, `COMP_IP_STRATEGY`, `BUSINESS_STRATEGY`) VALUES
	(1, 'sambit is overally good', 'Sambit is BU', 'Select Multiple,Print advertising', 1, 0, 1),
	(2, 'xadsxasx', 'saxasxas', 'Print advertising,Internet/website', 1, 0, 1);
/*!40000 ALTER TABLE `bus_det` ENABLE KEYS */;

-- Dumping structure for table precipiceip.company_det
DROP TABLE IF EXISTS `company_det`;
CREATE TABLE IF NOT EXISTS `company_det` (
  `COMP_DET_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_NAME` varchar(30) NOT NULL,
  `COMP_NAME` varchar(50) NOT NULL,
  `EMAIL_ID` varchar(50) NOT NULL,
  `ADDR_1` varchar(300) NOT NULL,
  `ADDR_2` varchar(300) NOT NULL,
  `CITY` varchar(30) NOT NULL,
  `ZIP` varchar(6) NOT NULL,
  `COUNTRY` varchar(30) NOT NULL,
  `PHONE_NO` varchar(15) NOT NULL,
  PRIMARY KEY (`COMP_DET_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Dumping data for table precipiceip.company_det: ~1 rows (approximately)
DELETE FROM `company_det`;
/*!40000 ALTER TABLE `company_det` DISABLE KEYS */;
INSERT INTO `company_det` (`COMP_DET_ID`, `USER_NAME`, `COMP_NAME`, `EMAIL_ID`, `ADDR_1`, `ADDR_2`, `CITY`, `ZIP`, `COUNTRY`, `PHONE_NO`) VALUES
	(1, 'Sambit', 'Cognizant', 'sambitbunty@gmail.com', 'Marathahalli, Bangalore', 'Nayapalli, Bhubaneswar', 'Bhubaneswar', '751012', 'India', '9036863876');
/*!40000 ALTER TABLE `company_det` ENABLE KEYS */;

-- Dumping structure for table precipiceip.fin_det
DROP TABLE IF EXISTS `fin_det`;
CREATE TABLE IF NOT EXISTS `fin_det` (
  `FIN_DET_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ANN_REVENUE` varchar(50) NOT NULL,
  `NO_OF_EMPLOYEES` varchar(50) NOT NULL,
  `COMP_INVEST_IN_RND` varchar(300) NOT NULL,
  `BUS_IN_COUNTRIES` varchar(300) NOT NULL,
  `THIRD_PARTY_PROD` tinyint(1) NOT NULL,
  `COMP_BUS_TYPE` tinyint(1) NOT NULL,
  `SELL_PROD` varchar(300) NOT NULL,
  `SELL_SERVICE` tinyint(1) NOT NULL,
  `SELL_PROD_AND_SVC` tinyint(1) NOT NULL,
  `LIC_PROP` tinyint(1) NOT NULL,
  PRIMARY KEY (`FIN_DET_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Dumping data for table precipiceip.fin_det: ~1 rows (approximately)
DELETE FROM `fin_det`;
/*!40000 ALTER TABLE `fin_det` DISABLE KEYS */;
INSERT INTO `fin_det` (`FIN_DET_ID`, `ANN_REVENUE`, `NO_OF_EMPLOYEES`, `COMP_INVEST_IN_RND`, `BUS_IN_COUNTRIES`, `THIRD_PARTY_PROD`, `COMP_BUS_TYPE`, `SELL_PROD`, `SELL_SERVICE`, `SELL_PROD_AND_SVC`, `LIC_PROP`) VALUES
	(1, '1 billion or more', '1000 or more', 'Closed innovation,Open innovation', 'US,Canada', 1, 1, 'OEM,Retailer', 0, 1, 0);
/*!40000 ALTER TABLE `fin_det` ENABLE KEYS */;

-- Dumping structure for table precipiceip.login_credential
DROP TABLE IF EXISTS `login_credential`;
CREATE TABLE IF NOT EXISTS `login_credential` (
  `CREDENTIAL_ID` int(11) NOT NULL AUTO_INCREMENT,
  `EMAIL_ID` varchar(30) DEFAULT NULL,
  `PASSWORD` varchar(30) DEFAULT NULL,
  `FIRST_NAME` varchar(30) DEFAULT NULL,
  `LAST_NAME` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`CREDENTIAL_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

-- Dumping data for table precipiceip.login_credential: ~9 rows (approximately)
DELETE FROM `login_credential`;
/*!40000 ALTER TABLE `login_credential` DISABLE KEYS */;
INSERT INTO `login_credential` (`CREDENTIAL_ID`, `EMAIL_ID`, `PASSWORD`, `FIRST_NAME`, `LAST_NAME`) VALUES
	(1, 'sacdsac!dc@dwsc.cws', 'sd!cwdcwd', 'xasxasc', 'dsacd'),
	(2, 'sacdsac!dc@dwsc.cws', 'sd!cwdcwd', 'xasxasc', 'dsacd'),
	(3, 'kaa@sdf.dgf', 'dfvfd', 'kaka', 'ak'),
	(5, 'sambit@kumar.com', 'sambitpassword', 'sambit', 'kumar'),
	(6, 'chaku@mail.com', 'chakapassword', 'chakra', 'dhara'),
	(7, 'bangalore@mail.com', 'bad,dapaasd', 'bangalore', 'karnataka'),
	(8, 'bubu@mail.com', 'bubupassword', 'bubu', 'kumar'),
	(9, 'cdscsd@ad.rtf', 'dsdasa', 'cdscdsc', 'cdscds'),
	(10, 'asd@sdfc.dr', 'csdcsd', 'dad', 'asd');
/*!40000 ALTER TABLE `login_credential` ENABLE KEYS */;

-- Dumping structure for table precipiceip.risk_mgmt_det
DROP TABLE IF EXISTS `risk_mgmt_det`;
CREATE TABLE IF NOT EXISTS `risk_mgmt_det` (
  `RSK_MGMT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `HAS_CONF_INFO` int(1) NOT NULL,
  `HAS_IP_POLICY` tinyint(1) NOT NULL,
  `HAS_IP_POLICIES_LIST` varchar(300) NOT NULL,
  `AGR_MNG` tinyint(1) NOT NULL,
  `AGR_MNG_LIST` varchar(300) NOT NULL,
  `HAS_ERM` tinyint(1) NOT NULL,
  `HAS_ERM_LIST` varchar(300) NOT NULL,
  `THIRD_PARTY_LIA` varchar(300) NOT NULL,
  `SELF_INS_IP_LOSE` int(11) NOT NULL,
  `HAS_THIRDPARTY_INS` int(11) NOT NULL,
  `THIRD_PARTY_INS` varchar(300) NOT NULL,
  `HAS_OVER_IP_GOV` varchar(300) NOT NULL,
  PRIMARY KEY (`RSK_MGMT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Dumping data for table precipiceip.risk_mgmt_det: ~0 rows (approximately)
DELETE FROM `risk_mgmt_det`;
/*!40000 ALTER TABLE `risk_mgmt_det` DISABLE KEYS */;
INSERT INTO `risk_mgmt_det` (`RSK_MGMT_ID`, `HAS_CONF_INFO`, `HAS_IP_POLICY`, `HAS_IP_POLICIES_LIST`, `AGR_MNG`, `AGR_MNG_LIST`, `HAS_ERM`, `HAS_ERM_LIST`, `THIRD_PARTY_LIA`, `SELF_INS_IP_LOSE`, `HAS_THIRDPARTY_INS`, `THIRD_PARTY_INS`, `HAS_OVER_IP_GOV`) VALUES
	(1, 1, 1, 'Publication,Ownership of IP', 1, 'Select Multiple,CDAs/NDAs', 1, 'IPR Docketing system,Patents', 'Freedom to operate practices,Agreement audit practices', 1, 1, 'Abatement coverage,Enforcement coverage', 'Board oversight and reporting,Legal/compliance oversight and management');
/*!40000 ALTER TABLE `risk_mgmt_det` ENABLE KEYS */;

-- Dumping structure for table precipiceip.trd_det
DROP TABLE IF EXISTS `trd_det`;
CREATE TABLE IF NOT EXISTS `trd_det` (
  `TRD_DET_ID` int(11) NOT NULL AUTO_INCREMENT,
  `PRESERVE_COPYRIGHTS` tinyint(1) DEFAULT NULL,
  `REG_TRADEMARK` tinyint(1) DEFAULT NULL,
  `DOM_REFLECT_BN` tinyint(1) DEFAULT NULL,
  `DOM_REFLECT_PN` tinyint(1) DEFAULT NULL,
  `TRADE_SECRETS` tinyint(1) DEFAULT NULL,
  `CAT_TRADE_SEC` tinyint(1) DEFAULT NULL,
  `MANAGE_CYBER_SECURITY_RISK` tinyint(1) DEFAULT NULL,
  `PROT_TRD_SECRETS` tinyint(1) DEFAULT NULL,
  `PROT_CONFIDENTIAL_INFO` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`TRD_DET_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Dumping data for table precipiceip.trd_det: ~0 rows (approximately)
DELETE FROM `trd_det`;
/*!40000 ALTER TABLE `trd_det` DISABLE KEYS */;
INSERT INTO `trd_det` (`TRD_DET_ID`, `PRESERVE_COPYRIGHTS`, `REG_TRADEMARK`, `DOM_REFLECT_BN`, `DOM_REFLECT_PN`, `TRADE_SECRETS`, `CAT_TRADE_SEC`, `MANAGE_CYBER_SECURITY_RISK`, `PROT_TRD_SECRETS`, `PROT_CONFIDENTIAL_INFO`) VALUES
	(1, 1, 0, 1, 0, 1, 0, 1, 0, 1),
	(2, 1, 0, 1, 0, 1, 0, 1, 0, 1);
/*!40000 ALTER TABLE `trd_det` ENABLE KEYS */;

-- Dumping structure for table precipiceip.user_det
DROP TABLE IF EXISTS `user_det`;
CREATE TABLE IF NOT EXISTS `user_det` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `COMP_DET_ID` int(11) DEFAULT NULL,
  `FIN_DET_ID` int(11) DEFAULT NULL,
  `TRD_DET_ID` int(11) DEFAULT NULL,
  `RSK_MGMT_ID` int(11) DEFAULT NULL,
  `BUS_DET_ID` int(11) DEFAULT NULL,
  `REG_USER_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

-- Dumping data for table precipiceip.user_det: ~6 rows (approximately)
DELETE FROM `user_det`;
/*!40000 ALTER TABLE `user_det` DISABLE KEYS */;
INSERT INTO `user_det` (`USER_ID`, `COMP_DET_ID`, `FIN_DET_ID`, `TRD_DET_ID`, `RSK_MGMT_ID`, `BUS_DET_ID`, `REG_USER_ID`) VALUES
	(1, 0, 0, 0, 0, 0, 5),
	(2, 0, 0, 0, 0, 0, 6),
	(3, 0, 0, 0, 0, 0, 7),
	(4, 0, 0, 0, 0, 0, 8),
	(5, 0, 0, 0, 0, 0, 9),
	(6, 0, 0, 0, 0, 0, 10);
/*!40000 ALTER TABLE `user_det` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
