package com;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 10;
		try {
		if(age>=18) {
			System.out.println("You can Vote!");
		}else {
			//throw new Exception();		// throw generic exception 
			//throw new Exception("Age must be >=18"); // generic with custom message
			//throw new VoteException();		// custom exception or user defined exception it call empty construcotr 
			throw new VoteException("Age must be >=18");	// it call parameterized constructor 
		}
		}catch(VoteException e) {
			System.out.println("Custom exception "+e.toString());
		}
		catch(Exception e) {
			System.out.println("Exception generate "+e.toString());
		}
		System.out.println("Normal Statement");
	}

}
