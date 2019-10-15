package com.jbk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Farmer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	
	@Column(name = "Id")
	
	private int id;
	
	@Column(name = "Name",nullable=false, length=250)

	private String Name;
	
	@Column(name = "District")
	
	private String District;
	
	@Column(name = "State")
	
	private String State;
	
	@Column(name = "Country")
	
	private String Country;
	
	@Column(name = "Quantity")
	
	private int Quantity;
	
	public Farmer() {
		
	}

	public Farmer(int id, String name, String district, String state, String country, int quantity) {
		super();
		this.id = id;
		Name = name;
		District = district;
		State = state;
		Country = country;
		Quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public long getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	@Override
	public String toString() {
		return "Farmer [id=" + id + ", Name=" + Name + ", District=" + District + ", State=" + State + ", Country="
				+ Country + ", Quantity=" + Quantity + "]";
	}
	

}
