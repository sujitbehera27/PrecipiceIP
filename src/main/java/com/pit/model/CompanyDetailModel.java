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
@Table(name = "company_det")
public class CompanyDetailModel implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COMP_DET_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int companyDetailsID;
	
	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "COMP_NAME")
	private String companyName;
	
	@Column(name = "EMAIL_ID")
	private String emailID;
	
	@Column(name = "ADDR_1")
	private String address1;
	
	@Column(name = "ADDR_2")
	private String address2;
	
	@Column(name = "CITY")
	private String city;
	
	@Column(name = "ZIP")
	private String zip;
	
	@Column(name = "COUNTRY")
	private String country;
	
	@Column(name = "PHONE_NO")
	private String phoneNo;
	
	
	public int getCompanyDetailsID() {
		return companyDetailsID;
	}

	public void setCompanyDetailsID(final int companyDetailsID) {
		this.companyDetailsID = companyDetailsID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(final String userName) {
		this.userName = userName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(final String companyName) {
		this.companyName = companyName;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(final String emailID) {
		this.emailID = emailID;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(final String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(final String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(final String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(final String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(final String country) {
		this.country = country;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(final String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
}
