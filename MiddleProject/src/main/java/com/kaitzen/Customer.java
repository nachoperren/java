package com.kaitzen;

import java.sql.Connection;
import java.sql.ResultSet;
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
	    String insertQuery = "INSERT INTO PERSON (name) values (?)";
	    client.insert(insertQuery);
		return this;
	}
	
	public Customer load(String dni) {
		return this;
	}
	
	public Customer update() {
		return this;
	}
	
	public List<Customer> search(DBClient client, String attribute, String value) {
		ResultSet result = client.select("CUSTOMER", attribute, value);
		 return null;
	 }

}
