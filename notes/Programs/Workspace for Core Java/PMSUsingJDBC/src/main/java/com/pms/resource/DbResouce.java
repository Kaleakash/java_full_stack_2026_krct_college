package com.pms.resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbResouce {
	private static Connection con;
	// load only once when the class get loaded.... 
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e_commerce", "root", "root123");
		} catch (Exception e) {
			System.out.println("in static block "+e.toString());
		}
	}
	
	public static Connection getConnection() {
		try {
			return con;
		} catch (Exception e) {
			System.out.println("In Resource layer "+e.toString());
		}
		return null;
	}
}
