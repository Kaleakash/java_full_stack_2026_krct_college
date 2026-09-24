package com.pms.main;

import java.util.List;
import java.util.Scanner;

import com.pms.bean.Product;
import com.pms.service.ProductService;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String con;
		int pid;
		String pname;
		float price;
		ProductService ps = new ProductService();
		String result;
		do {
			System.out.println("1:Add Product 2: Display Product 3: Delete Product");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: System.out.println("Add Operation");
					System.out.println("Enter the product  id");
					 pid = sc.nextInt();
					 System.out.println("Enter the product name");
					 pname = sc.next();
					 System.out.println("Enter the product price");
					 price = sc.nextFloat();
					 Product p = new Product();
					 p.setPid(pid);
					 p.setPname(pname);
					 p.setPrice(price);
					 result = ps.addProduct(p);
					 System.out.println(result);
					break;
			case 2: System.out.println("Display Operation");
				    List<Product> listOfProducts = ps.listOfProducts();
				    for(Product p1 : listOfProducts) {
				    	System.out.println("PId "+p1.getPid()+" PName "+p1.getPname()+" Price "+p1.getPrice());
				    }
			        break;
			case 3: System.out.println("Delete Operation");
					System.out.println("Enter the product  id");
						pid = sc.nextInt(); 
						result = ps.deleteProduct(pid);
						System.out.println(result);
						break;
			 default :System.out.println("Wrong choice");
			        break;
			}
			System.out.println("Do you want to continue(y/n)");
			con = sc.next();
		} while (con.equals("y"));
		System.out.println("Thank you");
	}

}
