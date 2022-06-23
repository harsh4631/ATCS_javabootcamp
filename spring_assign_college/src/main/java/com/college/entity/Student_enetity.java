package com.college.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name="student")
public class Student_enetity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String name;
	
	@OneToOne
	Admission_enetity admission;
	
	@OneToMany(mappedBy = "students")
	private List<Address_enetity> adress;
	
	@ManyToMany
	private List<Teacher_enetity> teacher;
	
	public Student_enetity() {
		
	}

	public Student_enetity(int id, String name, Admission_enetity admission, List<Address_enetity> adress,
			List<Teacher_enetity> teacher) {
		super();
		this.id = id;
		this.name = name;
		this.admission = admission;
		this.adress = adress;
		this.teacher = teacher;
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

	public Admission_enetity getAdmission() {
		return admission;
	}

	public void setAdmission(Admission_enetity admission) {
		this.admission = admission;
	}

  @JsonManagedReference
	public List<Address_enetity> getAdress() {
		return adress;
	}

	public void setAdress(List<Address_enetity> adress) {
		this.adress = adress;
	}

	public List<Teacher_enetity> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<Teacher_enetity> teacher) {
		this.teacher = teacher;
	}

	
}
