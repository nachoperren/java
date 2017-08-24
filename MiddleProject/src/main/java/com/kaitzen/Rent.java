package com.kaitzen;

import java.util.Date;
import java.util.List;

public class Rent {
	Customer customer;
	Car car;
	Date dateFrom;
	Date dateTo;

	public Rent save() {
		return this;
	}
	
	public Rent update() {
		return this;
	}
	
	public List<Rent> search(Customer customer, Car car) {
		 return null;
	}

}
