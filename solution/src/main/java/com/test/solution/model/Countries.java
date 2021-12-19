package com.test.solution.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Country")
public class Countries {
	@Id
	@Column(name="Country_ID")
	   private int id;
	@Column(name="Country_Name")
	   private String name;
	
	@JsonIgnore
	   @OneToMany
	   @JoinColumn(name="Country_ID")
	    private Set<Students> students;
	
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
}
