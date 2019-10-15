package com.jbk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jbk.model.Farmer;

@Repository
public interface FarmerRepository extends JpaRepository<Farmer, Integer>{

}
