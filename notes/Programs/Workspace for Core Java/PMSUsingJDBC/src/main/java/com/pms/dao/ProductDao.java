package com.pms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.pms.bean.Product;
import com.pms.resource.DbResouce;

public class ProductDao {

	public int storeProduct(Product product) {
		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e_commerce", "root", "root123");
		Connection con = DbResouce.getConnection();
		PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?)");
		pstmt.setInt(1, product.getPid());
		pstmt.setString(2, product.getPname());
		pstmt.setFloat(3, product.getPrice());
		int result = pstmt.executeUpdate();
		return result;
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		return 0;
	}
	
	public int deleteProduct(int pid) {
		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e_commerce", "root", "root123");
		Connection con = DbResouce.getConnection();
		PreparedStatement pstmt = con.prepareStatement("delete from product where pid=?");
		pstmt.setInt(1, pid);
		int result = pstmt.executeUpdate();
		return result;
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		return 0;
	}
	
	public int updateProductPrice(Product product) {
		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e_commerce", "root", "root123");
		Connection con = DbResouce.getConnection();
		PreparedStatement pstmt = con.prepareStatement("update product set price = ? where pid=?");
		pstmt.setFloat(1, product.getPrice());
		pstmt.setInt(2, product.getPid());
		int result = pstmt.executeUpdate();
		return result;
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		return 0;
	}
	
	
}
