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
	@NamedQuery(name = "QUERY_USER_DETAIL_SET_REGID", query = "from UserDetailModel userDet where userDet.regUserID=:regUserID")
})
public class UserDetailModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "USER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userID ;
	
	@Column(name = "COMP_DET_ID")
	private int companyDetailsID;
	
	@Column(name = "FIN_DET_ID")
	private int financeDetailsID;
	
	@Column(name = "TRD_DET_ID")
	private int tradeDetailsID;
	
	@Column(name = "RSK_MGMT_ID")
	private int riskManagementID;
	
	@Column(name = "BUS_DET_ID")
	private int businessDetailsID;
	
	@Column(name = "REG_USER_ID")
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
