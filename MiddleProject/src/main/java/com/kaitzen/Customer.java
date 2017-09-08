package com.kaitzen;

import java.sql.ResultSet;
import java.util.ArrayList;
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
	    	result = dbClient.update(insertQuery);
	    } catch (Exception e) {
	    	System.out.println("Error guardando el customer");
	    }
	    if (result)
	    	return this;
	    else
	    	return null;
	}
	
	static public Customer load(String dni, DBClient dbClient) {
		Customer result = new Customer();
		String loadQuery = "SELECT * FROM CUSTOMER WHERE dni = '" + dni + "')";
	    try {
	    	ResultSet resultSet = dbClient.search(loadQuery);
	    	resultSet.next();
	    	result.dni = resultSet.getString("dni");
	    	result.name = resultSet.getString("name");
	    	result.birthday = resultSet.getDate("birthday");
	    	result.phone = resultSet.getString("phone");
	    } catch (Exception e) {
	    	result = null;
	    	System.out.println("Error buscando el customer por DNI");
	    }
	    return result;
	}
	
	public Customer update() {
		return this;
	}
	
	public static List<Customer> search(DBClient dbClient, String name, Date birthday, String phone) {
		List<Customer> result = new ArrayList<Customer>();
		String loadQuery = "SELECT * FROM CUSTOMER WHERE ";
		String loadQueryAttrs = "";
		if (name != null) {
			loadQueryAttrs+= "name = " + name;
		}
		if (birthday != null) {
			if (loadQueryAttrs.length()>0) {
				loadQueryAttrs+=", ";
			}
			loadQueryAttrs+= "birthday = " + birthday;
		}
		if (phone != null) {
			if (loadQueryAttrs.length()>0) {
				loadQueryAttrs+=", ";
			}
			loadQueryAttrs+= "phone = " + phone;
		}
	    try {
	    	ResultSet resultSet = dbClient.search(loadQuery);
	    	resultSet.next();
	    	Customer cust = new Customer();
	    	cust.dni = resultSet.getString("dni");
	    	cust.name = resultSet.getString("name");
	    	cust.birthday = resultSet.getDate("birthday");
	    	cust.phone = resultSet.getString("phone");
	    	result.add
	    } catch (Exception e) {
	    	result = null;
	    	System.out.println("Error buscando el customer por DNI");
	    }
	    return result;
	 }

}
