package com.jbk.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="logintable")
@SuppressWarnings("serial")
public class Login {

	
		

		@Id
		@GeneratedValue
		private int lid;
		

		private String username;
		private String password;
	    private String usertype;
		
		public int getLid() {
			return lid;
		}

		public void setLid(int lid) {
			this.lid = lid;
		}

	    
	    public Login()
	    {
	    	
	    }

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

	     

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getUsertype() {
			return usertype;
		}

		public void setUsertype(String usertype) {
			this.usertype = usertype;
		}

		   
		  

	}

	
	
	

