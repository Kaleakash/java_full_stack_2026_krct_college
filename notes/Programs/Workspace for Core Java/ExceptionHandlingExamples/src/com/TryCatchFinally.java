package com;

public class TryCatchFinally {
	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b = 0;
		try {
		int result = a/b;
		System.out.println("Result is "+result);
		System.out.println("No Exception");
		}
//		catch(Exception e) {
//			System.out.println("Exception block");
//		}
		finally {
			System.out.println("Finally block");
		}
		System.out.println("Normal Statement");
	}
}
