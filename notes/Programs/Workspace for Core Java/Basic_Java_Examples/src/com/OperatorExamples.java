package com;

public class OperatorExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int result1  = a+b;
		System.out.println("Sum of two number is "+result1);
		boolean result2 = a>b;
		System.out.println("a >b is "+result2);
		int n=100;
		int m;
		m=n;
		System.out.println(n);	//100
		System.out.println(m);	//100
		m=n++;
		System.out.println(n);	//101
		System.out.println(m);	// 100
		m=++n;
		System.out.println(n);	// 102
		System.out.println(m);	// 102
	}

}
