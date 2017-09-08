package com.kaitzen;

import java.util.Calendar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	DBClient dbClient = new DBClient();
    	dbClient.init();
    	// CREATE
    	Customer fede = new Customer();
    	fede.name = "fede pellegrinet";
    	fede.dni = "32059919";
    	fede.phone = "15576566";
    	Calendar cal = Calendar.getInstance();
    	cal.set(Calendar.YEAR, 1986);
    	cal.set(Calendar.MONTH, 1);
    	cal.set(Calendar.DAY_OF_MONTH, 1);
    	fede.birthday = cal.getTime();
    	
    	Customer savedFede = null;
    	int limit = 0;
    	while (savedFede == null && limit < 11) {
    		limit++;
    		savedFede = fede.save(dbClient);
    	}
        
    	//LOAD
    	Customer fede1 = Customer.load("32059919", dbClient);
    	
    }
}
