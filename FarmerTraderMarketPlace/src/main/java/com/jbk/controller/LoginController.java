package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jbk.model.Login;

import com.jbk.service.LoginService;

@Controller
public class LoginController {
	

	@Autowired
	private	LoginService loginservice;
	
	 @RequestMapping(value = "/user", method = RequestMethod.GET)
	   public ModelAndView user() {
	      Login login = new Login();	  
		  ModelAndView modelAndView = new ModelAndView("login", "command", login);
		  return modelAndView;
	   }

	   @RequestMapping(value = "/addUser", method = RequestMethod.POST)
	   public ModelAndView addUser(@ModelAttribute("SpringWeb")Login login, 
	      Model model) {
	  //we pass all information on user jsp page to another page using addobject
	     // model.addObject("user",login);
	      model.addAttribute("login", login);
	      return new ModelAndView("users");
	   }
	   
	
	
	 @RequestMapping(value="/userlogin",method=RequestMethod.GET)
	 	public ModelAndView gotOUserLogin()
	 	{
	 		
	 		return new ModelAndView("loginpage");
	 	
	 	}
	 
	 @RequestMapping(value="/finduserbyname",method=RequestMethod.GET)
	 	public ModelAndView finduserbyname(@ModelAttribute("login") Login login)
	 	{
		 
		 Login userinfofromdb=loginservice.findbyusername(login.getUsername());
		 
		 
    String usertypefromdb=	 userinfofromdb.getUsertype();
	System.out.println(usertypefromdb);
	
	
	boolean userexist=loginservice.checkuservalidation(login.getUsername(), login.getPassword());
	// 
	
		if((userexist)&&(usertypefromdb.equals("farmer")))
			{
		return new ModelAndView("farmerpage");
	         }
	 		
	       
		else if((userexist)&&(usertypefromdb.equals("trader")))
		{
	        return new ModelAndView("traderpage");
        }
		
		else if((userexist)&&(usertypefromdb.equals("admin")))
		{
	        return new ModelAndView("adminpage");
        }
		
		return new ModelAndView("loginpage");
	
	}
}
