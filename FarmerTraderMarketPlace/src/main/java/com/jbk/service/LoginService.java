package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.model.Login;
import com.jbk.model.Trader;
import com.jbk.repository.LoginRepository;
import com.jbk.repository.UserRepository;

@Service
public class LoginService {

			  @Autowired 
		  private LoginRepository logrepo;
			  
			  @Autowired
			  private UserRepository userrepr;
		 
	 public Login findbyusername(String username)
	 {
		return logrepo.findByusername(username);
	 }

	   public boolean checkuservalidation(String username,String password)
	   {
		
	       return logrepo.existsByUsernameAndPassword(username, password);
		
       }
	   
	   
	   public List<Trader> getAlluser()
	   {
		   return userrepr.findAll();
	   }

	public Trader findById(int id) {
		
		return userrepr.findById(id).get();
	}

	public void save(Trader user) {
	
		userrepr.save(user);	
		
	}


 }
