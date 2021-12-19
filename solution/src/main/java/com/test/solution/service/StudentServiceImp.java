package com.test.solution.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.solution.model.Classes;
import com.test.solution.model.Countries;
import com.test.solution.model.Students;
import com.test.solution.repository.ClassRepository;
import com.test.solution.repository.CountryRepository;
import com.test.solution.repository.StudentRepository;

@Service
public class StudentServiceImp {
	@Autowired
      ClassRepository classrepo;
	@Autowired
    CountryRepository countryrepo;
	@Autowired
    StudentRepository sturepo;
	
	public  String addStudent(Students student) 
	{
	    sturepo.saveAndFlush(student);
		return "Student added Successfully";
	}
	
	public  String addClass(Classes classes) 
	{
	    classrepo.saveAndFlush(classes);
		return "Class added Successfully";
	}
	
	public  String addCountry( Countries country) 
	{
	    countryrepo.saveAndFlush(country);
		return "Country added Successfully";
	}
	
	public int studentsPerClass(int classId)
	{
		
		List<Students> list1=sturepo.findbyClassId(classId);
		
		int count=list1.size();
		return count;
	}
	
	public int Average()
	{
		return sturepo.avg();
	}
	
	
	
}
