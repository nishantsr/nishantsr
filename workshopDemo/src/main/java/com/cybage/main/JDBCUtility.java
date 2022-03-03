package com.cybage.main;

import java.sql.*;

public class JDBCUtility {
	 public static final String URL= "jdbc:mysql://localhost:3306/product";
	 public static final String USER= "root";
	 public static final String PASSWORD= "root";
	 public static Connection getConnection() throws SQLException {
		 try{
			
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 System.out.println("Connection established.....");
			 
		 } catch (ClassNotFoundException e) {
				e.printStackTrace();
		}
		return DriverManager.getConnection(URL, USER, PASSWORD);
	 }
}
