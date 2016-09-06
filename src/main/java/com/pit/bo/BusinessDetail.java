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

@XmlRootElement(name="businessDetail")
public class BusinessDetail  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int businessDetailID;
	private String compOverall;
	private String compByBu;
	private List<String> compMarketAct;
	private int compIpPolicy;
	private int compIpStrategy;
	private int businesStrategy;

	public int getBusinessDetailID() {
		return businessDetailID;
	}

	public void setBusinessDetailID(final int businessDetailID) {
		this.businessDetailID = businessDetailID;
	}

	public String getCompOverall() {
		return compOverall;
	}

	public void setCompOverall(final String compOverall) {
		this.compOverall = compOverall;
	}

	public String getCompByBu() {
		return compByBu;
	}

	public void setCompByBu(final String compByBu) {
		this.compByBu = compByBu;
	}

	public List<String> getCompMarketAct() {
		return compMarketAct;
	}

	public void setCompMarketAct(final List<String> compMarketAct) {
		this.compMarketAct = compMarketAct;
	}

	public int getCompIpPolicy() {
		return compIpPolicy;
	}

	public void setCompIpPolicy(final int compIpPolicy) {
		this.compIpPolicy = compIpPolicy;
	}

	public int getCompIpStrategy() {
		return compIpStrategy;
	}

	public void setCompIpStrategy(final int compIpStrategy) {
		this.compIpStrategy = compIpStrategy;
	}

	public int getBusinesStrategy() {
		return businesStrategy;
	}

	public void setBusinesStrategy(final int businesStrategy) {
		this.businesStrategy = businesStrategy;
	}
	
}
