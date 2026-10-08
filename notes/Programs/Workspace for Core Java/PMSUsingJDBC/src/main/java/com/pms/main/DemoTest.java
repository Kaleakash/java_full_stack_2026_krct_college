package com.pms.main;

import java.util.Scanner;

import com.pms.bean.Product;
import com.pms.service.ProductService;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductService ps = new ProductService();
		int pid;
		String result;
		String pname;
		float price;
		Scanner sc = new Scanner(System.in);
		String con;
		do {
			System.out.println("1 : Add Product 2: Delete product 3 : Update Product");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch (ch) {
			
			case 1:System.out.println("Enter the product id");
					pid = sc.nextInt();
					System.out.println("Enter the product name");
					pname = sc.next();
					System.out.println("Enter the price");
					price = sc.nextFloat();
					Product p1  = new Product();
					p1.setPid(pid);
					p1.setPname(pname);
					p1.setPrice(price);
					result = ps.storeProduct(p1);
					System.out.println(result);		
					break;
				
			case 2:System.out.println("Enter the product id");
					pid = sc.nextInt();
					result = ps.deleteProduct(pid);
					System.out.println(result);		
					break;
		
			case 3:System.out.println("Enter the product id");
					pid = sc.nextInt();
					System.out.println("Enter the price");
					price = sc.nextFloat();
					Product p2  = new Product();
					p2.setPid(pid);
					
					p2.setPrice(price);
					result = ps.updateProductPrice(p2);
					System.out.println(result);		
					break;
		
			default:System.out.println("Wrong choice");
				break;
			}
			System.out.println("Do you want to continue?");
			con = sc.next();
		}while(con.equalsIgnoreCase("y"));
		System.out.println("Thank you!");
	}

}
