package com.jbk.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jbk.model.Trader;

import com.jbk.repository.LoginRepository;
import com.jbk.service.LoginService;

@Controller
public class UserController {
	
	 @Autowired 
	  private LoginService logser;
	 
	 
	 @RequestMapping(value = "/")
	    public ModelAndView listEmployee(ModelAndView model) throws IOException {
	        List<Trader> listUser = logser.getAlluser();
	        model.addObject("listUser", listUser);
	        model.setViewName("home");
	        return model;
	    }

	 @GetMapping("/approveUser/{tid}" )
	 public ModelAndView approveduser(@PathVariable int tid)
	 {
		 Trader user=logser.findById(tid);
		 user.setStatus("Approved");
		 logser.save(user);
		 return new ModelAndView("redirect:/");
	 }
	 
	 @RequestMapping("/rejectUser/{tid}")
	 public ModelAndView rejectedduser(@PathVariable int tid)
	 {
		 Trader user =logser.findById(tid);
		 user.setStatus("Rejected");
		 logser.save(user);
		 return new ModelAndView("redirect:/");
	 }
	
	
}
