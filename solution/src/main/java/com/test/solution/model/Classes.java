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
@Table(name="Class")
public class Classes {

   @Id
   @Column(name="Class_ID")
   private int id;
   @Column(name="Class_Name")
   private String class_name;
   
   @JsonIgnore
   @OneToMany
   @JoinColumn(name="Class_ID")
    private Set<Students> students;
   
   public Set<Students> getStudents() {
	return students;
}
public void setStudents(Set<Students> students) {
	this.students = students;
}
public int getId() {
	return id;
   }
   public void setId(int id) {
	this.id = id;
    }
   public String getClass_name() {
	return class_name;
    }
   public void setClass_name(String class_name) {
	this.class_name = class_name;
    }

}
