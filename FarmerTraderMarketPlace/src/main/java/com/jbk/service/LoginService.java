package com.jbk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.model.Login;
import com.jbk.repository.LoginRepository;

@Service
public class LoginService {

		

		  @Autowired 
		  private LoginRepository logrepo;
		 
	public Login findbyusername(String username){
		return logrepo.findByusername(username);
	}

	   public boolean checkuservalidation(String username,String password){
		
		return logrepo.existsByUsernameAndPassword(username, password);
		
	}

	}
