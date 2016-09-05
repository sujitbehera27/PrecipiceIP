package com.pit.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="riskMngDetail")
public class RiskMngDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	private int riskMngID;
	private int hasConfInfo;
	private int hasIpPolicy;
	private String hasIpPolicyList;
	private int agreementMngProt;
	private String agreementMngProtList;
	private int hasErm;
	private String hasErmList;
	private String thirdPartyLia;
	private int selfInsIpLose;
	private int purchedThirdPartyIns;
	private String thirdPartyIns;
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
