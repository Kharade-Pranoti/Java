package com.app.utils;

import java.sql.*;

public class DatabaseUtils {
	private static Connection connection;
	private static final String DB_URL;
	private static final String USERNAME;
	private static final String PASSWORD;
	
	static {
		DB_URL = "jdbc:mysql://localhost:3306/iacsd_mar24";
		USERNAME = "root";
		PASSWORD = "#cooladikar24";
	}
	
	// open the connection
	public static Connection openConnection() throws SQLException{
		connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		return connection;
	}
	
	// add a static method to close the connection
	public static void closeConnection() throws SQLException{
		if(connection != null)
		   connection.close();
		System.out.println("database connection is closed.");
	}

}
