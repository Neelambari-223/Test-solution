package com.test.solution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.solution.model.Classes;


@Repository
public interface ClassRepository extends JpaRepository<Classes,Integer> {
	
}
