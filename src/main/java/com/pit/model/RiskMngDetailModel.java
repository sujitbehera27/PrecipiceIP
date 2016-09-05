package com.pit.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "risk_mgmt_det")
public class RiskMngDetailModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "RSK_MGMT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int riskMngID;
	
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

	
	public int getRiskMngID() {
		return riskMngID;
	}

	public void setRiskMngID(final int riskMngID) {
		this.riskMngID = riskMngID;
	}

	public int getHasIpPolicy() {
		return hasIpPolicy;
	}

	public void setHasIpPolicy(final int hasIpPolicy) {
		this.hasIpPolicy = hasIpPolicy;
	}

	public String getHasIpPolicyList() {
		return hasIpPolicyList;
	}

	public void setHasIpPolicyList(final String hasIpPolicyList) {
		this.hasIpPolicyList = hasIpPolicyList;
	}

	public int getAgreementMngProt() {
		return agreementMngProt;
	}

	public void setAgreementMngProt(final int agreementMngProt) {
		this.agreementMngProt = agreementMngProt;
	}

	public String getAgreementMngProtList() {
		return agreementMngProtList;
	}

	public void setAgreementMngProtList(final String agreementMngProtList) {
		this.agreementMngProtList = agreementMngProtList;
	}

	public int getHasErm() {
		return hasErm;
	}

	public void setHasErm(final int hasErm) {
		this.hasErm = hasErm;
	}

	public String getHasErmList() {
		return hasErmList;
	}

	public void setHasErmList(final String hasErmList) {
		this.hasErmList = hasErmList;
	}

	public String getHasOverIpGov() {
		return hasOverIpGov;
	}

	public void setHasOverIpGov(final String hasOverIpGov) {
		this.hasOverIpGov = hasOverIpGov;
	}

	public int getHasConfInfo() {
		return hasConfInfo;
	}

	public void setHasConfInfo(final int hasConfInfo) {
		this.hasConfInfo = hasConfInfo;
	}

	public String getThirdPartyLia() {
		return thirdPartyLia;
	}

	public void setThirdPartyLia(final String thirdPartyLia) {
		this.thirdPartyLia = thirdPartyLia;
	}

	public int getSelfInsIpLose() {
		return selfInsIpLose;
	}

	public void setSelfInsIpLose(final int selfInsIpLose) {
		this.selfInsIpLose = selfInsIpLose;
	}

	public int getPurchedThirdPartyIns() {
		return purchedThirdPartyIns;
	}

	public void setPurchedThirdPartyIns(final int purchedThirdPartyIns) {
		this.purchedThirdPartyIns = purchedThirdPartyIns;
	}

	public String getThirdPartyIns() {
		return thirdPartyIns;
	}

	public void setThirdPartyIns(final String thirdPartyIns) {
		this.thirdPartyIns = thirdPartyIns;
	}
	
}
