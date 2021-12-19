package com.test.solution.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.test.solution.model.Students;

@Repository
public interface StudentRepository extends JpaRepository<Students,Integer> {
	List<Students> findbyClassId(int classId);
	List<Students> findbyCountryId(int countryId);
	@Query(value = "SELECT avg(age) FROM Students")
	public int avg();
}

