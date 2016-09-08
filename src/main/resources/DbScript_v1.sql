/*LATEST DB DESIGN- SUJIT*/
DROP TABLE IF EXISTS `login_credential`;
CREATE TABLE IF NOT EXISTS `login_credential` (
  `CREDENTIAL_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_ID` varchar(50) NOT NULL DEFAULT '0', 
  `EMAIL_ID` varchar(30) DEFAULT NULL,
  `PASSWORD` varchar(30) DEFAULT NULL,
  `FIRST_NAME` varchar(30) DEFAULT NULL,
  `LAST_NAME` varchar(30) DEFAULT NULL,
  UNIQUE (`USER_ID`),
  PRIMARY KEY (`CREDENTIAL_ID`)
) ;

DROP TABLE IF EXISTS `user_det`;
CREATE TABLE IF NOT EXISTS `user_det` (
  `USER_DET_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_ID` int(11) NOT NULL,
  `COMP_OVERALL` varchar(300) DEFAULT NULL,
  `COMP_BY_BU` varchar(300) DEFAULT NULL,
  `COMP_MARK_ACTIVITY` varchar(300) DEFAULT NULL,
  `COMP_IP_POLICY` tinyint(1) DEFAULT NULL,
  `COMP_IP_STRATEGY` tinyint(1) DEFAULT NULL,
  `BUSINESS_STRATEGY` tinyint(1) DEFAULT NULL,
  `USER_NAME` varchar(30) DEFAULT NULL,
  `COMP_NAME` varchar(50) DEFAULT NULL,
  `EMAIL_ID` varchar(50) DEFAULT NULL,
  `ADDR_1` varchar(300) DEFAULT NULL,
  `ADDR_2` varchar(300) DEFAULT NULL,
  `CITY` varchar(30) DEFAULT NULL,
  `ZIP` varchar(6) DEFAULT NULL,
  `COUNTRY` varchar(30) DEFAULT NULL,
  `PHONE_NO` varchar(15) DEFAULT NULL,
  `ANN_REVENUE` varchar(50) DEFAULT NULL,
  `NO_OF_EMPLOYEES` varchar(50) DEFAULT NULL,
  `COMP_INVEST_IN_RND` varchar(300) DEFAULT NULL,
  `BUS_IN_COUNTRIES` varchar(300) DEFAULT NULL,
  `THIRD_PARTY_PROD` tinyint(1) DEFAULT NULL,
  `COMP_BUS_TYPE` tinyint(1) DEFAULT NULL,
  `SELL_PROD` varchar(300) DEFAULT NULL,
  `SELL_SERVICE` tinyint(1) DEFAULT NULL,
  `SELL_PROD_AND_SVC` tinyint(1) DEFAULT NULL,
  `LIC_PROP` tinyint(1) DEFAULT NULL,
  `HAS_CONF_INFO` int(1) DEFAULT NULL,
  `HAS_IP_POLICY` tinyint(1) DEFAULT NULL,
  `HAS_IP_POLICIES_LIST` varchar(300) DEFAULT NULL,
  `AGR_MNG` tinyint(1) DEFAULT NULL,
  `AGR_MNG_LIST` varchar(300) DEFAULT NULL,
  `HAS_ERM` tinyint(1) DEFAULT NULL,
  `HAS_ERM_LIST` varchar(300) DEFAULT NULL,
  `THIRD_PARTY_LIA` varchar(300) DEFAULT NULL,
  `SELF_INS_IP_LOSE` int(11) DEFAULT NULL,
  `HAS_THIRDPARTY_INS` int(11) DEFAULT NULL,
  `THIRD_PARTY_INS` varchar(300) DEFAULT NULL,
  `HAS_OVER_IP_GOV` varchar(300) DEFAULT NULL,
  `PRESERVE_COPYRIGHTS` tinyint(1) DEFAULT NULL,
  `REG_TRADEMARK` tinyint(1) DEFAULT NULL,
  `DOM_REFLECT_BN` tinyint(1) DEFAULT NULL,
  `DOM_REFLECT_PN` tinyint(1) DEFAULT NULL,
  `TRADE_SECRETS` tinyint(1) DEFAULT NULL,
  `CAT_TRADE_SEC` tinyint(1) DEFAULT NULL,
  `MANAGE_CYBER_SECURITY_RISK` tinyint(1) DEFAULT NULL,
  `PROT_TRD_SECRETS` tinyint(1) DEFAULT NULL,
  `PROT_CONFIDENTIAL_INFO` tinyint(1) DEFAULT NULL,
   PRIMARY KEY (`USER_DET_ID`),
   UNIQUE (`USER_ID`)
) ;
