package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.jbk.model.Trader;
import com.jbk.service.MailService;

import com.jbk.service.TraderService;


@Controller
public class TraderController {
	
	@Autowired
	private	TraderService traderservice;
	

	@Autowired
	private MailService mailservice;
	

	
	
	@RequestMapping(value="/signuphere", method=RequestMethod.GET)
	public ModelAndView gotosignupupage()
	{
		return new ModelAndView("traderregister");
	}
	

	@RequestMapping(value="/savedetailofuser", method=RequestMethod.GET)
	
	public ModelAndView savedetailofuser(@ModelAttribute("trader") Trader trader)
	{
	String emailofuser=	trader.getEmail();
	
       System.out.println(emailofuser);
     	Trader trader1=	traderservice.create(trader);
		if(trader1 != null)
		{
			
			try {
				mailservice.send(emailofuser, "pallavichaudhari1892@gmail.com", "pls check your mail,you are succesfully registered ", "you are succesfully registerd");
				
				mailservice.send("tusharbob7@gmail.com", "pallavichaudhari1892@gmail.com", "pls check mail for new trader registration ", emailofuser);
				
				System.out.println("ok");
				
			} catch (Exception e) 
			{
				System.out.println(e.getMessage());
			}
		}
		
		return new ModelAndView("/traderregister");
		
	}
	
	@RequestMapping(value="/listoftrader",method=RequestMethod.GET)
	public ModelAndView listOfTrader(@ModelAttribute ("trader") Trader trader)
	{
		List<Trader> listoftraderfromdb=traderservice.listoftrader(trader.tid);
	
	
	return new ModelAndView("listoftrader","listoftraderfromdb",listoftraderfromdb);
	}
	
	

}
