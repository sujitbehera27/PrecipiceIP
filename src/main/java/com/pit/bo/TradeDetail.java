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

@XmlRootElement(name="tradeDetail")
public class TradeDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	private int tradeDetailsID;
	private int preserveCopyRight;
	private int regTradeMark;
	private int domainRefBN;
	private int domainRefPN;
	private int tradeSec;
	private int categoriTradeSec;
	private int mngCyberSecRisk;
	private int protectTradeSec;
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
