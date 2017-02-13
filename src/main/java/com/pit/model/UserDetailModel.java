package com.pit.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "user_det")
@NamedQueries({
	@NamedQuery(name = "QUERY_USER_DETAIL_ID", query = "from UserDetailModel userDet where userDet.userID=:userID")
})
public class UserDetailModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "USER_ID")
	private String userID ;
	
//	@Column(name = "USER_DET_ID")
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int userDetId ;
	
	/*Trade Details*/
	@Column(name = "PRESERVE_COPYRIGHTS")
	private int preserveCopyRight;
	
	@Column(name = "HOW_PRESERVE_COPYRIGHT")
	private String howPreserveCopyRight;
	
	@Column(name = "REG_TRADEMARK")
	private int regTradeMark;
	
	@Column(name = "WHER_REG_TRADEMARK")
	private String wherRegTradeMark;
	
	@Column(name = "DOM_REFLECT_BN")
	private int domainRefBN;
	
	@Column(name = "DOM_REFLECT_PN")
	private int domainRefPN;
	
	@Column(name = "TRADE_SECRETS")
	private int tradeSec;
	
	@Column(name = "CAT_TRADE_SEC")
	private int categoriTradeSec;
	
	@Column(name = "MANAGE_CYBER_SECURITY_RISK")
	private int mngCyberSecRisk;
	
	@Column(name = "FRAME_MNG_CYBER_SEC_RISK")
	private String frameMngCyberSecRisk;
	
	@Column(name = "PROT_TRD_SECRETS")
	private int protectTradeSec;
	
	@Column(name = "MEASURE_PROTECT_TRADE_SEC")
	private String measureProtectTradeSec;
	
	@Column(name = "PROT_CONFIDENTIAL_INFO")
	private int protectConfInfo;
	
	@Column(name = "PATENTABLE_INNOV")
	private int patentableInnov;
	
	@Column(name = "PATENTABLE_INNOV_FILE")
	private String patentableInnovFile;
	
	@Column(name = "PER_ONG_TRADE_SEC")
	private int perOngTradeSec;
	
	/*Risk Managements*/
	@Column(name = "HAS_CONF_INFO")
	private int hasConfInfo;
	
	@Column(name = "PROTECT_TRADE_SEC")
	private String protectTradeSce;
	
	@Column(name = "HAS_IP_POLICY")
	private int hasIpPolicy;
	
	@Column(name = "HAS_IP_POLICIES_LIST")
	private String hasIpPolicyList;
	
	@Column(name = "AGR_MNG")
	private int agreementMngProt;
	
	@Column(name = "AGR_MNG_LIST")
	private String agreementMngProtList;
	
	@Column(name = "HAS_ERM")
	private int hasErm;
	
	@Column(name = "HAS_ERM_LIST")
	private String hasErmList;
	
	@Column(name = "THIRD_PARTY_LIA")
	private String thirdPartyLia;
	
	@Column(name = "SELF_INS_IP_LOSE")
	private int selfInsIpLose;
	
	@Column(name = "HAS_THIRDPARTY_INS")
	private int purchedThirdPartyIns;
	
	@Column(name = "THIRD_PARTY_INS")
	private String thirdPartyIns;
	
	@Column(name = "DOES_COMP_HAS_OVER_IP_GOV")
	private int doesCompHasOverIpGov;
	
	@Column(name = "HAS_OVER_IP_GOV")
	private String hasOverIpGov;
	
	@Column(name = "EMP_AGREE_UNIT")
	private String empAgreeUtil;
	
	@Column(name = "LAST_NDA_AGREE")
	private String lastNDAAgree;
	
	@Column(name = "IPR_DOCKETING")
	private String iprDocketing;
	
	@Column(name = "AMT_FOUND")
	private int amtFound;
	
	@Column(name = "COMP_BENCHMARK")
	private String compBenchmark;
	
	/*Finance Detail*/
	@Column(name = "ANN_REVENUE")
	private String annualRev;
	
	@Column(name = "NO_OF_EMPLOYEES")
	private String noOfEmp;
	
	@Column(name = "COMP_INVEST_IN_RND")
	private String investInRnD;
	
	@Column(name = "BUS_IN_COUNTRIES")
	private String busInCountries;
	
	@Column(name = "THIRD_PARTY_PROD")
	private int thirdPartyProd;
	
	@Column(name = "COMP_BUS_TYPE")
	private int compBusType;
	
	@Column(name = "SELL_PROD")
	private String sellProd;
	
	@Column(name = "SELL_SERVICE")
	private int sellService;
	
	@Column(name = "SELL_PROD_AND_SVC")
	private int sellProdAndSvc;
	
	@Column(name = "LIC_PROP")
	private int licProp;
	
	@Column(name = "GROSS_REVENUE")
	private int grossRevenue;
	
	@Column(name = "PROJECTED_SALE")
	private int projectedSale;
	
	@Column(name = "REV_TO_RandD")
	private String revToRandD;
	
	@Column(name = "AMT_SPEND")
	private int amtSpend;
	
	@Column(name = "SPEND_BIZ_UNIT")
	private int  spendBizUnit;
	
	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "COMP_NAME")
	private String companyName;
	
	@Column(name = "EMAIL_ID")
	private String emailID;
	
	@Column(name = "ADDR_1")
	private String address1;
	
	@Column(name = "ADDR_2")
	private String address2;
	
	@Column(name = "CITY")
	private String city;
	
	@Column(name = "ZIP")
	private String zip;
	
	@Column(name = "COUNTRY")
	private String country;
	
	@Column(name = "PHONE_NO")
	private String phoneNo;

	@Column(name = "COMP_OVERALL")
	private String compOverall;
	
	@Column(name = "COMP_BY_BU")
	private String compByBu;
	
	@Column(name = "COMP_MARK_ACTIVITY")
	private String compMarketAct;
	
	@Column(name = "COMP_IP_POLICY")
	private int compIpPolicy;
	
	@Column(name = "COMP_IP_STRATEGY")
	private int compIpStrategy;
	
	@Column(name = "BUSINESS_STRATEGY")
	private int businesStrategy;
	
	@Column(name = "PRIMARY_INDUSTRY")
	private String primaryIndus;
	
	
	/*R&D*/
	@Column(name = "COMP_COND_IP_POLICY")
	private int compCondIpPolicy;
	
	@Column(name = "INTELLI_MONITOR")
	private int intelliMonitor;
	
	@Column(name = "SPACE_ANALY")
	private int spaceAnaly;
	
	@Column(name = "RandD_IN_CENT_ORG")
	private int randDInCentOrg;
	
	@Column(name = "INNOV_FROM_INT_EMP")
	private int innovFromIntEmp;
	
	@Column(name = "BIZ_UNIT_CONDUCT")
	private String bizUnitConduct;
	
	@Column(name = "EMP_SIGN_NDA")
	private int empSignNDA;
	
	@Column(name = "OPEN_INNOV_PORTAL")
	private int openInnovPortal;
	
	@Column(name = "OPEN_INNOV_THIRD_PARTY")
	private int openInnovThirdParty;
	
	
	/*IP-Governance*/
	
	@Column(name = "EXTRACT_VALUE")
	private String extractValue;
	
	@Column(name = "COMP_EXT_VALUE")
	private String compExtValue;
	
	@Column(name = "COMP_EXT_THROUGH")
	private String compExtThrough;
	
	@Column(name = "INTER_COMP_IP_AGREE")
	private int interCompIpAgree;
	
	@Column(name = "TRAIN_FOR_SECURE")
	private int trainForSecure;
	
	@Column(name = "EMP_HAND_BOOK")
	private int empHandbook;
	
	@Column(name = "IP_AS_FIN_REPORT")
	private int ipAsFinReport;
	
	@Column(name = "REVIEW_AGGR")
	private int reviewAggr;
	
	@Column(name = "DEF_IP_STRATG")
	private int defIpStratg;
	
	@Column(name = "IP_AUDITS")
	private int ipAudits;
	
	@Column(name = "IP_RIGHTS_AT_EMP_TIME")
	private int ipRightsAtEmptTime;
	
	@Column(name = "EMP_RECV_ADD_INCENT")
	private int empRecvAddIncent;
	
	/*3rd Party*/
	@Column(name = "COMP_FOR_INVEST")
	private int compForInvest;
	
	@Column(name = "ACQ_PRO_MandA")
	private int acqProcMandA = 0;
	
	@Column(name = "ENG_JOINT_DEV")
	private int engJointDev;
	
	@Column(name = "CONTRACT_RES_ORG")
	private int contractResOrg;
	
	@Column(name = "ORG_COMP_INT")
	private int orgCompInt;
	
	@Column(name = "PAST_IP_RIGHTS")
	private int pastIpRights;
	
	@Column(name = "DEDICAT_STAF_RES")
	private int dedicatStafRes;
	
	@Column(name = "CO_PROMO_AGREE")
	private int coPromoAgree;
	
	@Column(name = "IND_SUBMIT_IDEA")
	private int indSubmitIdea;
	
	@Column(name = "GATHER_IDEAS")
	private int gatherIdeas;
	
//	public int getUserDetId() {
//		return userDetId;
//	}
//
//	public void setUserDetId(int userDetId) {
//		this.userDetId = userDetId;
//	}

	public String getCompOverall() {
		return compOverall;
	}

	public void setCompOverall(String compOverall) {
		this.compOverall = compOverall;
	}

	public String getCompByBu() {
		return compByBu;
	}

	public void setCompByBu(String compByBu) {
		this.compByBu = compByBu;
	}

	public String getCompMarketAct() {
		return compMarketAct;
	}

	public void setCompMarketAct(String compMarketAct) {
		this.compMarketAct = compMarketAct;
	}

	public int getCompIpPolicy() {
		return compIpPolicy;
	}

	public void setCompIpPolicy(int compIpPolicy) {
		this.compIpPolicy = compIpPolicy;
	}

	public int getCompIpStrategy() {
		return compIpStrategy;
	}

	public void setCompIpStrategy(int compIpStrategy) {
		this.compIpStrategy = compIpStrategy;
	}

	public int getBusinesStrategy() {
		return businesStrategy;
	}

	public void setBusinesStrategy(int businesStrategy) {
		this.businesStrategy = businesStrategy;
	}

	public int getPreserveCopyRight() {
		return preserveCopyRight;
	}

	public void setPreserveCopyRight(int preserveCopyRight) {
		this.preserveCopyRight = preserveCopyRight;
	}

	public int getRegTradeMark() {
		return regTradeMark;
	}

	public void setRegTradeMark(int regTradeMark) {
		this.regTradeMark = regTradeMark;
	}

	public int getDomainRefBN() {
		return domainRefBN;
	}

	public void setDomainRefBN(int domainRefBN) {
		this.domainRefBN = domainRefBN;
	}

	public int getDomainRefPN() {
		return domainRefPN;
	}

	public void setDomainRefPN(int domainRefPN) {
		this.domainRefPN = domainRefPN;
	}

	public int getTradeSec() {
		return tradeSec;
	}

	public void setTradeSec(int tradeSec) {
		this.tradeSec = tradeSec;
	}

	public int getCategoriTradeSec() {
		return categoriTradeSec;
	}

	public void setCategoriTradeSec(int categoriTradeSec) {
		this.categoriTradeSec = categoriTradeSec;
	}

	public int getMngCyberSecRisk() {
		return mngCyberSecRisk;
	}

	public void setMngCyberSecRisk(int mngCyberSecRisk) {
		this.mngCyberSecRisk = mngCyberSecRisk;
	}

	public int getProtectTradeSec() {
		return protectTradeSec;
	}

	public void setProtectTradeSec(int protectTradeSec) {
		this.protectTradeSec = protectTradeSec;
	}

	public int getProtectConfInfo() {
		return protectConfInfo;
	}

	public void setProtectConfInfo(int protectConfInfo) {
		this.protectConfInfo = protectConfInfo;
	}

	public int getHasConfInfo() {
		return hasConfInfo;
	}

	public void setHasConfInfo(int hasConfInfo) {
		this.hasConfInfo = hasConfInfo;
	}

	public int getHasIpPolicy() {
		return hasIpPolicy;
	}

	public void setHasIpPolicy(int hasIpPolicy) {
		this.hasIpPolicy = hasIpPolicy;
	}

	public String getHasIpPolicyList() {
		return hasIpPolicyList;
	}

	public void setHasIpPolicyList(String hasIpPolicyList) {
		this.hasIpPolicyList = hasIpPolicyList;
	}

	public int getAgreementMngProt() {
		return agreementMngProt;
	}

	public void setAgreementMngProt(int agreementMngProt) {
		this.agreementMngProt = agreementMngProt;
	}

	public String getAgreementMngProtList() {
		return agreementMngProtList;
	}

	public void setAgreementMngProtList(String agreementMngProtList) {
		this.agreementMngProtList = agreementMngProtList;
	}

	public int getHasErm() {
		return hasErm;
	}

	public void setHasErm(int hasErm) {
		this.hasErm = hasErm;
	}

	public String getHasErmList() {
		return hasErmList;
	}

	public void setHasErmList(String hasErmList) {
		this.hasErmList = hasErmList;
	}

	public String getThirdPartyLia() {
		return thirdPartyLia;
	}

	public void setThirdPartyLia(String thirdPartyLia) {
		this.thirdPartyLia = thirdPartyLia;
	}

	public int getSelfInsIpLose() {
		return selfInsIpLose;
	}

	public void setSelfInsIpLose(int selfInsIpLose) {
		this.selfInsIpLose = selfInsIpLose;
	}

	public int getPurchedThirdPartyIns() {
		return purchedThirdPartyIns;
	}

	public void setPurchedThirdPartyIns(int purchedThirdPartyIns) {
		this.purchedThirdPartyIns = purchedThirdPartyIns;
	}

	public String getThirdPartyIns() {
		return thirdPartyIns;
	}

	public void setThirdPartyIns(String thirdPartyIns) {
		this.thirdPartyIns = thirdPartyIns;
	}

	public String getHasOverIpGov() {
		return hasOverIpGov;
	}

	public void setHasOverIpGov(String hasOverIpGov) {
		this.hasOverIpGov = hasOverIpGov;
	}

	public String getAnnualRev() {
		return annualRev;
	}

	public void setAnnualRev(String annualRev) {
		this.annualRev = annualRev;
	}

	public String getNoOfEmp() {
		return noOfEmp;
	}

	public void setNoOfEmp(String noOfEmp) {
		this.noOfEmp = noOfEmp;
	}

	public String getInvestInRnD() {
		return investInRnD;
	}

	public void setInvestInRnD(String investInRnD) {
		this.investInRnD = investInRnD;
	}

	public String getBusInCountries() {
		return busInCountries;
	}

	public void setBusInCountries(String busInCountries) {
		this.busInCountries = busInCountries;
	}

	public int getThirdPartyProd() {
		return thirdPartyProd;
	}

	public void setThirdPartyProd(int thirdPartyProd) {
		this.thirdPartyProd = thirdPartyProd;
	}

	public int getCompBusType() {
		return compBusType;
	}

	public void setCompBusType(int compBusType) {
		this.compBusType = compBusType;
	}

	public String getSellProd() {
		return sellProd;
	}

	public void setSellProd(String sellProd) {
		this.sellProd = sellProd;
	}

	public int getSellService() {
		return sellService;
	}

	public void setSellService(int sellService) {
		this.sellService = sellService;
	}

	public int getSellProdAndSvc() {
		return sellProdAndSvc;
	}

	public void setSellProdAndSvc(int sellProdAndSvc) {
		this.sellProdAndSvc = sellProdAndSvc;
	}

	public int getLicProp() {
		return licProp;
	}

	public void setLicProp(int licProp) {
		this.licProp = licProp;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(final String userID) {
		this.userID = userID;
	}

	public String getHowPreserveCopyRight() {
		return howPreserveCopyRight;
	}

	public void setHowPreserveCopyRight(String howPreserveCopyRight) {
		this.howPreserveCopyRight = howPreserveCopyRight;
	}

	public String getWherRegTradeMark() {
		return wherRegTradeMark;
	}

	public void setWherRegTradeMark(String wherRegTradeMark) {
		this.wherRegTradeMark = wherRegTradeMark;
	}

	public String getFrameMngCyberSecRisk() {
		return frameMngCyberSecRisk;
	}

	public void setFrameMngCyberSecRisk(String frameMngCyberSecRisk) {
		this.frameMngCyberSecRisk = frameMngCyberSecRisk;
	}

	public String getMeasureProtectTradeSec() {
		return measureProtectTradeSec;
	}

	public void setMeasureProtectTradeSec(String measureProtectTradeSec) {
		this.measureProtectTradeSec = measureProtectTradeSec;
	}

	public int getPatentableInnov() {
		return patentableInnov;
	}

	public void setPatentableInnov(int patentableInnov) {
		this.patentableInnov = patentableInnov;
	}

	public String getPatentableInnovFile() {
		return patentableInnovFile;
	}

	public void setPatentableInnovFile(String patentableInnovFile) {
		this.patentableInnovFile = patentableInnovFile;
	}

	public int getPerOngTradeSec() {
		return perOngTradeSec;
	}

	public void setPerOngTradeSec(int perOngTradeSec) {
		this.perOngTradeSec = perOngTradeSec;
	}

	public String getProtectTradeSce() {
		return protectTradeSce;
	}

	public void setProtectTradeSce(String protectTradeSce) {
		this.protectTradeSce = protectTradeSce;
	}

	public int getDoesCompHasOverIpGov() {
		return doesCompHasOverIpGov;
	}

	public void setDoesCompHasOverIpGov(int doesCompHasOverIpGov) {
		this.doesCompHasOverIpGov = doesCompHasOverIpGov;
	}

	public String getEmpAgreeUtil() {
		return empAgreeUtil;
	}

	public void setEmpAgreeUtil(String empAgreeUtil) {
		this.empAgreeUtil = empAgreeUtil;
	}

	public String getLastNDAAgree() {
		return lastNDAAgree;
	}

	public void setLastNDAAgree(String lastNDAAgree) {
		this.lastNDAAgree = lastNDAAgree;
	}

	public String getIprDocketing() {
		return iprDocketing;
	}

	public void setIprDocketing(String iprDocketing) {
		this.iprDocketing = iprDocketing;
	}

	public int getAmtFound() {
		return amtFound;
	}

	public void setAmtFound(int amtFound) {
		this.amtFound = amtFound;
	}

	public String getCompBenchmark() {
		return compBenchmark;
	}

	public void setCompBenchmark(String compBenchmark) {
		this.compBenchmark = compBenchmark;
	}

	public int getGrossRevenue() {
		return grossRevenue;
	}

	public void setGrossRevenue(int grossRevenue) {
		this.grossRevenue = grossRevenue;
	}

	public int getProjectedSale() {
		return projectedSale;
	}

	public void setProjectedSale(int projectedSale) {
		this.projectedSale = projectedSale;
	}

	public String getRevToRandD() {
		return revToRandD;
	}

	public void setRevToRandD(String revToRandD) {
		this.revToRandD = revToRandD;
	}

	public int getAmtSpend() {
		return amtSpend;
	}

	public void setAmtSpend(int amtSpend) {
		this.amtSpend = amtSpend;
	}

	public int getSpendBizUnit() {
		return spendBizUnit;
	}

	public void setSpendBizUnit(int spendBizUnit) {
		this.spendBizUnit = spendBizUnit;
	}

	public String getPrimaryIndus() {
		return primaryIndus;
	}

	public void setPrimaryIndus(String primaryIndus) {
		this.primaryIndus = primaryIndus;
	}

	public int getCompCondIpPolicy() {
		return compCondIpPolicy;
	}

	public void setCompCondIpPolicy(int compCondIpPolicy) {
		this.compCondIpPolicy = compCondIpPolicy;
	}

	public int getIntelliMonitor() {
		return intelliMonitor;
	}

	public void setIntelliMonitor(int intelliMonitor) {
		this.intelliMonitor = intelliMonitor;
	}

	public int getSpaceAnaly() {
		return spaceAnaly;
	}

	public void setSpaceAnaly(int spaceAnaly) {
		this.spaceAnaly = spaceAnaly;
	}

	public int getRandDInCentOrg() {
		return randDInCentOrg;
	}

	public void setRandDInCentOrg(int randDInCentOrg) {
		this.randDInCentOrg = randDInCentOrg;
	}

	public int getInnovFromIntEmp() {
		return innovFromIntEmp;
	}

	public void setInnovFromIntEmp(int innovFromIntEmp) {
		this.innovFromIntEmp = innovFromIntEmp;
	}

	public String getBizUnitConduct() {
		return bizUnitConduct;
	}

	public void setBizUnitConduct(String bizUnitConduct) {
		this.bizUnitConduct = bizUnitConduct;
	}

	public int getEmpSignNDA() {
		return empSignNDA;
	}

	public void setEmpSignNDA(int empSignNDA) {
		this.empSignNDA = empSignNDA;
	}

	public int getOpenInnovPortal() {
		return openInnovPortal;
	}

	public void setOpenInnovPortal(int openInnovPortal) {
		this.openInnovPortal = openInnovPortal;
	}

	public int getOpenInnovThirdParty() {
		return openInnovThirdParty;
	}

	public void setOpenInnovThirdParty(int openInnovThirdParty) {
		this.openInnovThirdParty = openInnovThirdParty;
	}

	public String getExtractValue() {
		return extractValue;
	}

	public void setExtractValue(String extractValue) {
		this.extractValue = extractValue;
	}

	public String getCompExtValue() {
		return compExtValue;
	}

	public void setCompExtValue(String compExtValue) {
		this.compExtValue = compExtValue;
	}

	public String getCompExtThrough() {
		return compExtThrough;
	}

	public void setCompExtThrough(String compExtThrough) {
		this.compExtThrough = compExtThrough;
	}

	public int getInterCompIpAgree() {
		return interCompIpAgree;
	}

	public void setInterCompIpAgree(int interCompIpAgree) {
		this.interCompIpAgree = interCompIpAgree;
	}

	public int getTrainForSecure() {
		return trainForSecure;
	}

	public void setTrainForSecure(int trainForSecure) {
		this.trainForSecure = trainForSecure;
	}

	public int getEmpHandbook() {
		return empHandbook;
	}

	public void setEmpHandbook(int empHandbook) {
		this.empHandbook = empHandbook;
	}

	public int getIpAsFinReport() {
		return ipAsFinReport;
	}

	public void setIpAsFinReport(int ipAsFinReport) {
		this.ipAsFinReport = ipAsFinReport;
	}

	public int getReviewAggr() {
		return reviewAggr;
	}

	public void setReviewAggr(int reviewAggr) {
		this.reviewAggr = reviewAggr;
	}

	public int getDefIpStratg() {
		return defIpStratg;
	}

	public void setDefIpStratg(int defIpStratg) {
		this.defIpStratg = defIpStratg;
	}

	public int getIpAudits() {
		return ipAudits;
	}

	public void setIpAudits(int ipAudits) {
		this.ipAudits = ipAudits;
	}

	public int getIpRightsAtEmptTime() {
		return ipRightsAtEmptTime;
	}

	public void setIpRightsAtEmptTime(int ipRightsAtEmptTime) {
		this.ipRightsAtEmptTime = ipRightsAtEmptTime;
	}

	public int getEmpRecvAddIncent() {
		return empRecvAddIncent;
	}

	public void setEmpRecvAddIncent(int empRecvAddIncent) {
		this.empRecvAddIncent = empRecvAddIncent;
	}

	public int getCompForInvest() {
		return compForInvest;
	}

	public void setCompForInvest(int compForInvest) {
		this.compForInvest = compForInvest;
	}

	public int getAcqProcMandA() {
		return acqProcMandA;
	}

	public void setAcqProcMandA(int acqProcMandA) {
		this.acqProcMandA = acqProcMandA;
	}

	public int getEngJointDev() {
		return engJointDev;
	}

	public void setEngJointDev(int engJointDev) {
		this.engJointDev = engJointDev;
	}

	public int getContractResOrg() {
		return contractResOrg;
	}

	public void setContractResOrg(int contractResOrg) {
		this.contractResOrg = contractResOrg;
	}

	public int getOrgCompInt() {
		return orgCompInt;
	}

	public void setOrgCompInt(int orgCompInt) {
		this.orgCompInt = orgCompInt;
	}

	public int getPastIpRights() {
		return pastIpRights;
	}

	public void setPastIpRights(int pastIpRights) {
		this.pastIpRights = pastIpRights;
	}

	public int getDedicatStafRes() {
		return dedicatStafRes;
	}

	public void setDedicatStafRes(int dedicatStafRes) {
		this.dedicatStafRes = dedicatStafRes;
	}

	public int getCoPromoAgree() {
		return coPromoAgree;
	}

	public void setCoPromoAgree(int coPromoAgree) {
		this.coPromoAgree = coPromoAgree;
	}

	public int getIndSubmitIdea() {
		return indSubmitIdea;
	}

	public void setIndSubmitIdea(int indSubmitIdea) {
		this.indSubmitIdea = indSubmitIdea;
	}

	public int getGatherIdeas() {
		return gatherIdeas;
	}

	public void setGatherIdeas(int gatherIdeas) {
		this.gatherIdeas = gatherIdeas;
	}

	
	
}
