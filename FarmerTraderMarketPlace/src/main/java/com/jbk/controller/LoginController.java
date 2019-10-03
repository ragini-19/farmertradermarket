package com.jbk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
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


}
