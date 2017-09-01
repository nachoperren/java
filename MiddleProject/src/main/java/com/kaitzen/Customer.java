package com.kaitzen;

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
	
	public Customer save(DBClient dbClient) {
	    String insertQuery = "INSERT INTO CUSTOMER (dni, name, birthday, phone) values ('" + this.dni + "', '" + this.name + "', " + this.birthday + ", '" + this.phone + "')";
	    Boolean result = false;
	    try {
	    	result = dbClient.insert(insertQuery);
	    } catch (Exception e) {
	    	System.out.println("Error guardando el customer");
	    }
	    if (result)
	    	return this;
	    else
	    	return null;
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
