package com.buisness.entity;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private BigInteger id;
	
	@Column
	private String emailid;
	
	@Column
	private String first_name;
	
	@Column
	private String last_name;
	
	@Column
	private String password;
	
	public Users() {
		
	}

	public Users(BigInteger id, String emailid, String first_name, String last_name, String password) {
		super();
		this.id = id;
		this.emailid = emailid;
		this.first_name = first_name;
		this.last_name = last_name;
		this.password = password;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
