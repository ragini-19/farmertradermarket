package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	
	
	
	
	/*@RequestMapping("/login")
	public String login(ModelMap map)
	{
		return "login";
	}
	@RequestMapping(method=RequestMethod.POST, value="/login")
	public String successpage(ModelMap map, @RequestParam String username, @RequestParam String password )
	{
		System.out.println("I am in Home/ Controller");
		map.put("username", username);
		map.put("password", password);
		if(username.equals("admin") && password.equals("admin"))
		{
		return "success";
		}
		else
		{
			map.put("message","Please enter valid username or password");
return "login";
		}
		
	}
*/

}
