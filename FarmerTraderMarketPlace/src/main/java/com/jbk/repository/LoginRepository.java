package com.jbk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jbk.model.Login;

@Repository
public interface LoginRepository  extends JpaRepository<Login, Integer> {

	Login findByusername(String username);
	
	public boolean existsByUsernameAndPassword(String username,String password);


}