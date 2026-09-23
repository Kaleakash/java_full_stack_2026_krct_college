package org.krct.service;

import org.krct.bean.Employee;

public class EmployeeService {

	Employee emp = new Employee();
	
	public void displayEmployee() {
		//System.out.println("id is "+emp.id);
		//System.out.println("name is "+emp.name);
		//System.out.println("salary is "+emp.salary);
		System.out.println("department is "+emp.department);
	}
}
