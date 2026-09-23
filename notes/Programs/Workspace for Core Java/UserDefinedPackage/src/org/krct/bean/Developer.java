package org.krct.bean;

public class Developer extends Employee{

	public void displayDeveloperInfo() {
		//System.out.println("id is "+id); // private can't access 
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
		System.out.println("department is "+department);
	}
}
