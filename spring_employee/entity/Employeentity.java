package com.springsecond.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="shop")
public class Employeentity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;
	@Column
	private String name;

	@OneToOne
	Companyentity com_id;
	
	public Employeentity() {
		
	}

	public Employeentity(int id, String name, Companyentity com_id) {
		super();
		this.id = id;
		this.name = name;
		this.com_id = com_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Companyentity getNumber() {
		return com_id;
	}

	public void setNumber(Companyentity com_id) {
		this.com_id = com_id;
	}
	
	
}
