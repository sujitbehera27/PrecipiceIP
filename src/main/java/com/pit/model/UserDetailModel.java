package com.pit.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "user_det")
@NamedQueries({
	@NamedQuery(name = "QUERY_USER_DETAIL_SET_REGID", query = "from UserDetailModel userDet where userDet.regUserID=:userID")
})
public class UserDetailModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "USER_DET_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userDetId ;
	
	
	@Column(name = "USER_ID")
	private String userID ;
	
	@Column(name = "PRESERVE_COPYRIGHTS")
	private int preserveCopyRight;
	
	@Column(name = "REG_TRADEMARK")
	private int regTradeMark;
	
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
	
	@Column(name = "PROT_TRD_SECRETS")
	private int protectTradeSec;
	
	@Column(name = "PROT_CONFIDENTIAL_INFO")
	private int protectConfInfo;
	
	@Column(name = "HAS_CONF_INFO")
	private int hasConfInfo;
	
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
	
	@Column(name = "HAS_OVER_IP_GOV")
	private String hasOverIpGov;
	
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
	
	public int getUserDetId() {
		return userDetId;
	}

	public void setUserDetId(int userDetId) {
		this.userDetId = userDetId;
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

	
	
}
