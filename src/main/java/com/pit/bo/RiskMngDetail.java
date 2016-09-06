package com.pit.bo;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="riskMngDetail")
public class RiskMngDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	private int riskMngID;
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


	public int getAgreementMngProt() {
		return agreementMngProt;
	}

	public void setAgreementMngProt(final int agreementMngProt) {
		this.agreementMngProt = agreementMngProt;
	}


	public int getHasErm() {
		return hasErm;
	}

	public void setHasErm(final int hasErm) {
		this.hasErm = hasErm;
	}


	public int getHasConfInfo() {
		return hasConfInfo;
	}

	public void setHasConfInfo(final int hasConfInfo) {
		this.hasConfInfo = hasConfInfo;
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

	public List<String> getHasIpPolicyList() {
		return hasIpPolicyList;
	}

	public void setHasIpPolicyList(List<String> hasIpPolicyList) {
		this.hasIpPolicyList = hasIpPolicyList;
	}

	public List<String> getAgreementMngProtList() {
		return agreementMngProtList;
	}

	public void setAgreementMngProtList(List<String> agreementMngProtList) {
		this.agreementMngProtList = agreementMngProtList;
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
	
	

}
