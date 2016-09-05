
package com.pit.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "fin_det")
public class FinancialDetailModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "FIN_DET_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int finDetID;
	
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

	
	public int getFinDetID() {
		return finDetID;
	}

	public void setFinDetID(final int finDetID) {
		this.finDetID = finDetID;
	}

	public String getAnnualRev() {
		return annualRev;
	}

	public void setAnnualRev(final String annualRev) {
		this.annualRev = annualRev;
	}

	public String getNoOfEmp() {
		return noOfEmp;
	}

	public void setNoOfEmp(final String noOfEmp) {
		this.noOfEmp = noOfEmp;
	}

	public String getInvestInRnD() {
		return investInRnD;
	}

	public void setInvestInRnD(final String investInRnD) {
		this.investInRnD = investInRnD;
	}

	public String getBusInCountries() {
		return busInCountries;
	}

	public void setBusInCountries(final String busInCountries) {
		this.busInCountries = busInCountries;
	}

	public int getThirdPartyProd() {
		return thirdPartyProd;
	}

	public void setThirdPartyProd(final int thirdPartyProd) {
		this.thirdPartyProd = thirdPartyProd;
	}

	public int getCompBusType() {
		return compBusType;
	}

	public void setCompBusType(final int compBusType) {
		this.compBusType = compBusType;
	}

	public String getSellProd() {
		return sellProd;
	}

	public void setSellProd(final String sellProd) {
		this.sellProd = sellProd;
	}

	public int getSellService() {
		return sellService;
	}

	public void setSellService(final int sellService) {
		this.sellService = sellService;
	}

	public int getSellProdAndSvc() {
		return sellProdAndSvc;
	}

	public void setSellProdAndSvc(final int sellProdAndSvc) {
		this.sellProdAndSvc = sellProdAndSvc;
	}

	public int getLicProp() {
		return licProp;
	}

	public void setLicProp(final int licProp) {
		this.licProp = licProp;
	}
	
}
