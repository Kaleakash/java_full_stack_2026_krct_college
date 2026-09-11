package com;
import java.util.Scanner;
//import java.util.*;
public class TakingValueThroughKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value of a ");
//		int a = sc.nextInt();
//		System.out.println("Enter the value of b ");
//		int b = sc.nextInt();
//		int sum = a+b;
//		System.out.println("sum of two number is "+sum);
		int id;
		String name;
		float salary;
		System.out.println("Enter the id ");
		id = sc.nextInt();
		System.out.println("Enter the name");
		name = sc.next();
		System.out.println("Enter the salary");
		salary = sc.nextFloat();
		
		// business logic 
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("Salary is "+salary);
	}

}
