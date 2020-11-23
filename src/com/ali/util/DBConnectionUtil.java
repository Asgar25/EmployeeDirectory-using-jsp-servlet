package com.ali.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {
	
	// Define the database properties
	
	private static final String URL ="jdbc:mysql://localhost:3306/employeedirectory";
	
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	
	private static final String USERNAME = "root";
	
	private static final String PASSWORD = "root";
	
	private static Connection con = null;
	
	// define the static method
	
	public static Connection openConnection() {
		
		// check the connection
		if(con != null) {
			return con;
		} else {
			
			try {
				// load the connection
				Class.forName(DRIVER);
				
				// Get the connection
				con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				
			} catch (ClassNotFoundException e) {
                e.printStackTrace();
                
            } catch (SQLException e) {
                e.printStackTrace();
            } 
			// return the connection
			return con;
		}
		
		
	}

}
