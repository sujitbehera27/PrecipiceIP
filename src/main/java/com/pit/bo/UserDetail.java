package com.pit.bo;

import java.io.Serializable;
import java.util.List;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="userDetail")
public class UserDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	private String userID ;

	private String regUserID;
	
	/*Company Details*/
	private String userName;
	private String companyName;
	private String emailID;
	private String address1;
	private String address2;
	private String city;
	private String zip;
	private String country;
	private String phoneNo;
	
	private String compOverall;
	private String compByBu;
	private List<String> compMarketAct;
	private int compIpPolicy;
	private int compIpStrategy;
	private int businesStrategy;
	private String primaryIndus;
	
	/*Finance Detail*/
	private String annualRev;
	private String noOfEmp;
	private List<String> investInRnD;
	private List<String> busInCountries;
	private int thirdPartyProd;
	private int compBusType;
	private List<String> sellProd;
	private int sellService;
	private int sellProdAndSvc;
	private int licProp;
	private int grossRevenue;
	private int projectedSale;
	private String revToRandD;
	private int amtSpend;
	private int  spendBizUnit;
	
	/*Risk Managements*/
	private int hasConfInfo;
	private String protectTradeSce;
	private int hasIpPolicy;
	private List<String> hasIpPolicyList;
	private int agreementMngProt;
	private List<String> agreementMngProtList;
	private int hasErm;
	private List<String> hasErmList;
	private List<String> thirdPartyLia;
	private int selfInsIpLose;
	private int purchedThirdPartyIns;
	private List<String> thirdPartyIns;
	private int doesCompHasOverIpGov;
	private List<String> hasOverIpGov;
	private List<String> empAgreeUtil;
	private String lastNDAAgree;
	private String iprDocketing;
	private int amtFound;
	private String compBenchmark;
	
	/*Trade Details*/
	private int preserveCopyRight;
	private List<String> howPreserveCopyRight;
	private int regTradeMark;
	private List<String> wherRegTradeMark;
	private int domainRefBN;
	private int domainRefPN;
	private int tradeSec;
	private int categoriTradeSec;
	private int mngCyberSecRisk;
	private String frameMngCyberSecRisk;
	private int protectTradeSec;
	private List<String> measureProtectTradeSec;
	private int protectConfInfo;
	private int patentableInnov;
	private List<String> patentableInnovFile;
	private int perOngTradeSec; 
	
	/*R&D*/
	private int compCondIpPolicy;
	private int intelliMonitor;
	private int spaceAnaly;
	private int randDInCentOrg;
	private int innovFromIntEmp;
	private String bizUnitConduct;
	private int empSignNDA;
	private int openInnovPortal;
	private int openInnovThirdParty;
	
	/*IP-Governance*/
	private String extractValue;
	private List<String> compExtValue;
	private List<String> compExtThrough;
	private int interCompIpAgree;
	private int trainForSecure;
	private int empHandbook;
	private int ipAsFinReport;
	private int reviewAggr;
	private int defIpStratg;
	private int ipAudits;
	private int ipRightsAtEmptTime;
	private int empRecvAddIncent;
	
	/*3rd Party*/
	private int compForInvest;
	private int acqProcMandA;
	private int engJointDev;
	private int contractResOrg;
	private int orgCompInt;
	private int pastIpRights;
	private int dedicatStafRes;
	private int coPromoAgree;
	private int indSubmitIdea;
	private int gatherIdeas;
	
	private int formID; // Will Get From UI. 1-Comp Det, 2-Finance Det, 3-Biz Det, 4-Trade Det, 5-Risk Mng.
	

	public String getUserID() {
		return userID;
	}

	public void setUserID(final String userID) {
		this.userID = userID;
	}

	public String getRegUserID() {
		return regUserID;
	}

	public void setRegUserID(String regUserID) {
		this.regUserID = regUserID;
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

	public List<String> getCompMarketAct() {
		return compMarketAct;
	}

	public void setCompMarketAct(List<String> compMarketAct) {
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

	public List<String> getInvestInRnD() {
		return investInRnD;
	}

	public void setInvestInRnD(List<String> investInRnD) {
		this.investInRnD = investInRnD;
	}

	public List<String> getBusInCountries() {
		return busInCountries;
	}

	public void setBusInCountries(List<String> busInCountries) {
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

	public List<String> getSellProd() {
		return sellProd;
	}

	public void setSellProd(List<String> sellProd) {
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

	public List<String> getHasIpPolicyList() {
		return hasIpPolicyList;
	}

	public void setHasIpPolicyList(List<String> hasIpPolicyList) {
		this.hasIpPolicyList = hasIpPolicyList;
	}

	public int getAgreementMngProt() {
		return agreementMngProt;
	}

	public void setAgreementMngProt(int agreementMngProt) {
		this.agreementMngProt = agreementMngProt;
	}

	public List<String> getAgreementMngProtList() {
		return agreementMngProtList;
	}

	public void setAgreementMngProtList(List<String> agreementMngProtList) {
		this.agreementMngProtList = agreementMngProtList;
	}

	public int getHasErm() {
		return hasErm;
	}

	public void setHasErm(int hasErm) {
		this.hasErm = hasErm;
	}

	public List<String> getHasErmList() {
		return hasErmList;
	}

	public void setHasErmList(List<String> hasErmList) {
		this.hasErmList = hasErmList;
	}

	public List<String> getThirdPartyLia() {
		return thirdPartyLia;
	}

	public void setThirdPartyLia(List<String> thirdPartyLia) {
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

	public List<String> getThirdPartyIns() {
		return thirdPartyIns;
	}

	public void setThirdPartyIns(List<String> thirdPartyIns) {
		this.thirdPartyIns = thirdPartyIns;
	}

	public List<String> getHasOverIpGov() {
		return hasOverIpGov;
	}

	public void setHasOverIpGov(List<String> hasOverIpGov) {
		this.hasOverIpGov = hasOverIpGov;
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

	public int getFormID() {
		return formID;
	}

	public void setFormID(int formID) {
		this.formID = formID;
	}

	public String getPrimaryIndus() {
		return primaryIndus;
	}

	public void setPrimaryIndus(String primaryIndus) {
		this.primaryIndus = primaryIndus;
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

	public List<String> getEmpAgreeUtil() {
		return empAgreeUtil;
	}

	public void setEmpAgreeUtil(List<String> empAgreeUtil) {
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

	public List<String> getHowPreserveCopyRight() {
		return howPreserveCopyRight;
	}

	public void setHowPreserveCopyRight(List<String> howPreserveCopyRight) {
		this.howPreserveCopyRight = howPreserveCopyRight;
	}

	public List<String> getWherRegTradeMark() {
		return wherRegTradeMark;
	}

	public void setWherRegTradeMark(List<String> wherRegTradeMark) {
		this.wherRegTradeMark = wherRegTradeMark;
	}

	public String getFrameMngCyberSecRisk() {
		return frameMngCyberSecRisk;
	}

	public void setFrameMngCyberSecRisk(String frameMngCyberSecRisk) {
		this.frameMngCyberSecRisk = frameMngCyberSecRisk;
	}

	public List<String> getMeasureProtectTradeSec() {
		return measureProtectTradeSec;
	}

	public void setMeasureProtectTradeSec(List<String> measureProtectTradeSec) {
		this.measureProtectTradeSec = measureProtectTradeSec;
	}

	public int getPatentableInnov() {
		return patentableInnov;
	}

	public void setPatentableInnov(int patentableInnov) {
		this.patentableInnov = patentableInnov;
	}

	public List<String> getPatentableInnovFile() {
		return patentableInnovFile;
	}

	public void setPatentableInnovFile(List<String> patentableInnovFile) {
		this.patentableInnovFile = patentableInnovFile;
	}

	public int getPerOngTradeSec() {
		return perOngTradeSec;
	}

	public void setPerOngTradeSec(int perOngTradeSec) {
		this.perOngTradeSec = perOngTradeSec;
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

	public List<String> getCompExtValue() {
		return compExtValue;
	}

	public void setCompExtValue(List<String> compExtValue) {
		this.compExtValue = compExtValue;
	}

	public List<String> getCompExtThrough() {
		return compExtThrough;
	}

	public void setCompExtThrough(List<String> compExtThrough) {
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
