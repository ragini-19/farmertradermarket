package com.jbk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jbk.model.Trader;


public interface UserRepository extends JpaRepository<Trader, Integer>{
	
	public List<Trader> findAll();

}
