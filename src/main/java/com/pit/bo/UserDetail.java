package com.pit.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="userDetail")
public class UserDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	private int userID ;
	private int companyDetailsID;
	private int financeDetailsID;
	private int tradeDetailsID;
	private int riskManagementID;
	private int businessDetailsID;
	private int regUserID;
	

	public int getUserID() {
		return userID;
	}

	public void setUserID(final int userID) {
		this.userID = userID;
	}

	public int getCompanyDetailsID() {
		return companyDetailsID;
	}

	public void setCompanyDetailsID(final int companyDetailsID) {
		this.companyDetailsID = companyDetailsID;
	}

	public int getFinanceDetailsID() {
		return financeDetailsID;
	}

	public void setFinanceDetailsID(final int financeDetailsID) {
		this.financeDetailsID = financeDetailsID;
	}

	public int getTradeDetailsID() {
		return tradeDetailsID;
	}

	public void setTradeDetailsID(final int tradeDetailsID) {
		this.tradeDetailsID = tradeDetailsID;
	}

	public int getRiskManagementID() {
		return riskManagementID;
	}

	public void setRiskManagementID(final int riskManagementID) {
		this.riskManagementID = riskManagementID;
	}

	public int getBusinessDetailsID() {
		return businessDetailsID;
	}

	public void setBusinessDetailsID(final int businessDetailsID) {
		this.businessDetailsID = businessDetailsID;
	}

	public int getRegUserID() {
		return regUserID;
	}

	public void setRegUserID(int regUserID) {
		this.regUserID = regUserID;
	}
	
}
