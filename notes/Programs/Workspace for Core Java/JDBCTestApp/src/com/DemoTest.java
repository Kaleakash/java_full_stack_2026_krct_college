package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoTest {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/e_commerce";
		String username="root";
		String passwrod = "root123";
		try {
		// Load the Driver 
		Class.forName("com.mysql.cj.jdbc.Driver");	
		System.out.println("Driver Loaded successfully");
		// Establish the connection 
		Connection con =  DriverManager.getConnection(url, username, passwrod);
		System.out.println("Connected successfully");
		// create Statement 
		Statement stmt = con.createStatement();
		// retrieve query : select query 
		ResultSet rs  = stmt.executeQuery("select * from employees");
		// retrieve first employee record details 
//		rs.next();
//		System.out.println("Name is "+rs.getString(2)+" Salary "+rs.getFloat(4));
		while(rs.next()) {
			//System.out.println("Name is "+rs.getString(2)+" Salary "+rs.getFloat(4));
			System.out.println("Id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Department Name "+rs.getString(3)+" Salary is "+rs.getFloat(4)+" City is "+rs.getString(5));
		}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
