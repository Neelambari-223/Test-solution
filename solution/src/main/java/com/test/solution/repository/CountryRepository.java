package com.test.solution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.solution.model.Countries;

@Repository
public interface CountryRepository extends JpaRepository<Countries,Integer> {
}

