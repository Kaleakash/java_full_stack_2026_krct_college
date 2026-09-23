package org.krct.bean;

public class Employee {
private int id=100;
String name = "Raj"; // default 
protected float salary = 45000;
public String department="IT";

	public void displayEmployee() {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
		System.out.println("department is "+department);
	}
}
