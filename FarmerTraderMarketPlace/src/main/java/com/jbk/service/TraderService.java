package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.model.Trader;
import com.jbk.repository.LoginRepository;
import com.jbk.repository.TraderRepository;

@Service
public class TraderService {

	
	 @Autowired 
	  private TraderRepository traderrepo;
	 
	 
	 public Trader create(Trader trader) {
			
	Trader savesuccess=	traderrepo.save(trader);
	return savesuccess;
		
		}
	 
	 
	 public List listoftrader(int tid)
	 {
		 List<Trader> listoftrader=traderrepo.findAll();
		 return listoftrader;
	 }
	 
}
