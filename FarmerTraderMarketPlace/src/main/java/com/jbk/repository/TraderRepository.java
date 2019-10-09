package com.jbk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jbk.model.Login;
import com.jbk.model.Trader;

public interface TraderRepository  extends JpaRepository<Trader, Integer> {

}
