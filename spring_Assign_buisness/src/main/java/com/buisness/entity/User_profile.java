package com.buisness.entity;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="userprofile")
public class User_profile {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private BigInteger id_profile;
	
	@Column
	private String address1;
	
	@Column
	private String address2;
	
	@Column
	private String city;
	
	@Column
	private String country;
	
	@Column
	private String date;
	
	@Column
	private String Gender;
	
	@Column
	private String Phonenumber;
	
	@Column
	private String state;
	
	@Column
	private String street;
	
	@Column
	private String zip_code;
	
	@OneToOne
	Users id; 
	
	public User_profile() {
		
	}

	public User_profile(BigInteger id_profile, String address1, String address2, String city, String country,
			String date, String gender, String phonenumber, String state, String street, String zip_code, Users id) {
		super();
		this.id_profile = id_profile;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.country = country;
		this.date = date;
		Gender = gender;
		Phonenumber = phonenumber;
		this.state = state;
		this.street = street;
		this.zip_code = zip_code;
		this.id = id;
	}

	public BigInteger getId_profile() {
		return id_profile;
	}

	public void setId_profile(BigInteger id_profile) {
		this.id_profile = id_profile;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getPhonenumber() {
		return Phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		Phonenumber = phonenumber;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	public Users getId() {
		return id;
	}

	public void setId(Users id) {
		this.id = id;
	}
	
	
	
	
}
