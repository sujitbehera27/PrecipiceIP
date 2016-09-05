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
@Table(name = "bus_det")
public class BusinessDetailModel  implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "BUSINESS_DETAILS_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int businessDetailID;
	
	@Column(name = "COMP_OVERALL")
	private String compOverall;
	
	@Column(name = "COMP_BY_BU")
	private String compByBu;
	
	@Column(name = "COMP_MARK_ACTIVITY")
	private String compMarketAct;
	
	@Column(name = "COMP_IP_POLICY")
	private int compIpPolicy;
	
	@Column(name = "COMP_IP_STRATEGY")
	private int compIpStrategy;
	
	@Column(name = "BUSINESS_STRATEGY")
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

	public String getCompMarketAct() {
		return compMarketAct;
	}

	public void setCompMarketAct(final String compMarketAct) {
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
