package com;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {
		System.out.println("hi");
		try {
		int abc[]= {0,20,30,40};
		int result = 100/abc[6];
		System.out.println("Result "+result);
		}catch (ArithmeticException e) {
			System.out.println("Divided by "+e.toString());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index "+e.toString());
		}catch(Exception e) {
			System.out.println("Generic "+e.toString());
		}
		
		System.out.println("Normal Flow");
	}

}
