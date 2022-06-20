package com.springsecond.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comp")
public class Companyentity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int com_id;
	
	@Column
	private String emp_name;
	
	@Column
	private String emp_role;
	
	public Companyentity() {
		
	}

	public Companyentity(int com_id, String emp_name, String emp_role) {
		super();
		this.com_id = com_id;
		this.emp_name = emp_name;
		this.emp_role = emp_role;
	}

	public int getCom_id() {
		return com_id;
	}

	public void setCom_id(int com_id) {
		this.com_id = com_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_role() {
		return emp_role;
	}

	public void setEmp_role(String emp_role) {
		this.emp_role = emp_role;
	}

	
}
