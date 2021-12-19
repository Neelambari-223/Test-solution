package com.test.solution.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Students {

	@Id
	@Column(name="Student_ID")
	   private int id;
	@Column(name="Student_Name")
	  private String name;
	@Column(name="Age")
	  private int age;
	
	@ManyToOne
	@JoinColumn(name="Class_ID")
	 private Classes classes;
	@Column(name="ClassID")
	 private int classId=classes.getId();
	 
	@ManyToOne
	@JoinColumn(name="Country_ID")
	 private Countries countries;
	@Column(name="CountryID")
	private int countryId=countries.getId();
	
	
	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
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


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	public Countries getCountries() {
		return countries;
	}

	public void setCountries(Countries countries) {
		this.countries = countries;
	}

	
}
