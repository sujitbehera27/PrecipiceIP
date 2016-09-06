
package com.pit.bo;

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

@XmlRootElement(name="financialDetail")
public class FinancialDetail implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int finDetID;
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

	public List<String> getInvestInRnD() {
		return investInRnD;
	}

	public void setInvestInRnD(final List<String> investInRnD) {
		this.investInRnD = investInRnD;
	}

	public List<String> getBusInCountries() {
		return busInCountries;
	}

	public void setBusInCountries(final List<String> busInCountries) {
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

	public List<String> getSellProd() {
		return sellProd;
	}

	public void setSellProd(final List<String> sellProd) {
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
