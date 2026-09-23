package com;

public class RuntimeError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Hi");
			int a=10;
			int b=0;
			try {
			int result = a/b;		// new ArithmeticException()
			System.out.println("Sum is "+result);
			}catch(Exception e) {			// this catch block ready to handle all type of exception.
				//System.out.println("I Take Care");	// custom message 
				//System.err.println(e.getMessage());		// short message 
				System.err.println(e.toString());		// name and message 	
			}
			System.out.println("Bye...");
			System.out.println("Bye...");
			System.out.println("Bye...");
	}

}
