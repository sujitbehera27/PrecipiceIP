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
@Table(name = "trd_det")
public class TradeDetailModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "TRD_DET_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tradeDetailsID;
	
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
	
	
	public int getTradeDetailsID() {
		return tradeDetailsID;
	}

	public void setTradeDetailsID(final int tradeDetailsID) {
		this.tradeDetailsID = tradeDetailsID;
	}

	public int getPreserveCopyRight() {
		return preserveCopyRight;
	}

	public void setPreserveCopyRight(final int preserveCopyRight) {
		this.preserveCopyRight = preserveCopyRight;
	}
	
	public int getRegTradeMark() {
		return regTradeMark;
	}

	public void setRegTradeMark(final int regTradeMark) {
		this.regTradeMark = regTradeMark;
	}

	public int getDomainRefBN() {
		return domainRefBN;
	}

	public void setDomainRefBN(final int domainRefBN) {
		this.domainRefBN = domainRefBN;
	}

	public int getDomainRefPN() {
		return domainRefPN;
	}

	public void setDomainRefPN(final int domainRefPN) {
		this.domainRefPN = domainRefPN;
	}

	public int getTradeSec() {
		return tradeSec;
	}

	public void setTradeSec(final int tradeSec) {
		this.tradeSec = tradeSec;
	}

	public int getCategoriTradeSec() {
		return categoriTradeSec;
	}

	
	public void setCategoriTradeSec(final int categoriTradeSec) {
		this.categoriTradeSec = categoriTradeSec;
	}

	public int getMngCyberSecRisk() {
		return mngCyberSecRisk;
	}

	public void setMngCyberSecRisk(final int mngCyberSecRisk) {
		this.mngCyberSecRisk = mngCyberSecRisk;
	}

	public int getProtectTradeSec() {
		return protectTradeSec;
	}

	public void setProtectTradeSec(final int protectTradeSec) {
		this.protectTradeSec = protectTradeSec;
	}

	public int getProtectConfInfo() {
		return protectConfInfo;
	}

	public void setProtectConfInfo(final int protectConfInfo) {
		this.protectConfInfo = protectConfInfo;
	}
}
