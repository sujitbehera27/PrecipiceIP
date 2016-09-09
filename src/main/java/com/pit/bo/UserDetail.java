package com.pit.bo;

import java.io.Serializable;
import java.util.List;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="userDetail")
public class UserDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	private int userID ;

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
	
	private int hasConfInfo;
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
	private List<String> hasOverIpGov;
	
	private int preserveCopyRight;
	private int regTradeMark;
	private int domainRefBN;
	private int domainRefPN;
	private int tradeSec;
	private int categoriTradeSec;
	private int mngCyberSecRisk;
	private int protectTradeSec;
	private int protectConfInfo;
	
	private int formID; // Will Get From UI. 1-Comp Det, 2-Finance Det, 3-Biz Det, 4-Trade Det, 5-Risk Mng.
	

	public int getUserID() {
		return userID;
	}

	public void setUserID(final int userID) {
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
	
}
