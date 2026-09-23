package org.krct.pojo;
import org.krct.bean.*;
public class Manager extends Employee{

	public void displayManagerInfo() {	
		//System.out.println("id is "+id);	// private 
		//System.out.println("name is "+name);	// default 
		System.out.println("salary is "+salary);
		System.out.println("department is "+department);
	}
}
