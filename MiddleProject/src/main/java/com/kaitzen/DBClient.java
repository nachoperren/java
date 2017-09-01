package com.kaitzen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DBClient {
	private static final String DB_DRIVER = "org.h2.Driver";
    private static final String DB_CONNECTION = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";
    private static final String DB_USER = "sa";
    private static final String DB_PASSWORD = "";
    private static final String CREATE_CUSTOMER_QUERY = "CREATE TABLE CUSTOMER(	dni int primary key AUTO_INCREMENT, name varchar(255))";
    private static final String CREATE_CAR_QUERY = "CREATE TABLE CAR(id int primary key AUTO_INCREMENT, name varchar(255))";
    private static final String CREATE_RENT_QUERY = "CREATE TABLE RENT(id int primary key AUTO_INCREMENT, name varchar(255))";

    
    Connection dbConnection = null;

    public void init() {
    	if (dbConnection == null) {
    		connect();
    		createDB();
    	}
    }

	public void createDB() {
		try {
            dbConnection.setAutoCommit(false);
            PreparedStatement createPreparedStatement = dbConnection.prepareStatement(CREATE_QUERY);
            createPreparedStatement.executeUpdate();
            createPreparedStatement.close();
        } catch(SQLException sqlEx) {
            System.out.println("ERROR: " + sqlEx.getMessage());
        }
	}
	public void connect() {
		try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        try {
            dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
	}
	public ResultSet select(String table, String attribute, String value) {
		return null;
	}
	
	
	public boolean insert(String insertQuery) {
		try {
			PreparedStatement insertPreparedStatement = dbConnection.prepareStatement(insertQuery);
			insertPreparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("ERROR - No se pudo guardar la instancia");
			return false;
		}
		return true;
	}
	
	public void update() {
		
	}
}
