package com.kaitzen;

import java.util.Date;
import java.util.List;

public class Customer {
	String dni;
	String name;
	Date birthday;
	String phone;
	
	Customer(){}
	
	Customer(String dni, String name, Date birthday, String phone) {
		this.dni = dni;
		this.name = name;
		this.birthday = birthday;
		this.phone = phone;
	}
	
	public Customer save() {
		return this;
	}
	
	public Customer load(String dni) {
		return this;
	}
	
	public Customer update() {
		return this;
	}
	
	public List<Customer> search(String attribute, String value) {
		 return null;
	 }
}
