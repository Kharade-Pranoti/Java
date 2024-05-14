package com.app.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class DatabaseUtils {
	
	public static Connection connection;
	public static final String DB_URL;
	public static final String USERNAME;
	public static final String PASSWORD;
	
	static {
		DB_URL = "jdbc:mysql://localhost:3306/iacsd_mar24";
		USERNAME = "root";
		PASSWORD = "#cooladikar24";
	}
	
	// open the connection
	public static Connection openConnection() throws SQLException {
		connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		return connection;
	}
	
	// close the connection
	public static void closeConnection() throws SQLException {
		if (connection != null)
			connection.close();
		System.out.println("Database connection closed");
	}

}
