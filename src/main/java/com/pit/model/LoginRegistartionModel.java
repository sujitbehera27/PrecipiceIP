package com.pit.model;

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


@Entity
@Table(name = "login_credential")
@NamedQueries({
	@NamedQuery(name = "QUERY_LOGIN_AUTH", query = "from LoginRegistartionModel loginReg where loginReg.emailID=:emailID and loginReg.password=:password"),
	@NamedQuery(name = "QUERY_LOGIN_FORGOT", query = "from LoginRegistartionModel loginReg where loginReg.emailID=:emailID")
})

public class LoginRegistartionModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "CREDENTIAL_ID")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId = System.currentTimeMillis();

	@Column(name = "EMAIL_ID")
	private String emailID;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
//	public LoginRegistartionModel() {
//		userId = System.currentTimeMillis();
//	}
//	
//	public LoginRegistartionModel(long userId, String emailID, String password, String firstName, String lastName) {
//		super();
//		this.userId = System.currentTimeMillis();
//		this.emailID = emailID;
//		this.password = password;
//		this.firstName = firstName;
//		this.lastName = lastName;
//	}
	//@Id
	//@Column(name = "CREDENTIAL_ID")
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	//@Column(name = "EMAIL_ID")
	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(final String emailID) {
		this.emailID = emailID;
	}
	//@Column(name = "PASSWORD")
	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}
	//@Column(name = "FIRST_NAME")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}
	//@Column(name = "LAST_NAME")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}
	
}
