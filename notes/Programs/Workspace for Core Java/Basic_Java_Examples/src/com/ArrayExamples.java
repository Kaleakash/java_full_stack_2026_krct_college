package com;

public class ArrayExamples {

	public static void main(String[] args) {
		int abc[];
		//int xyz[10];
		int num[]= {10,20,30};
		System.out.println(num[0]);
		System.out.println(num[1]);
		int num1[]=new int[5];
		System.out.println("size of array is "+num.length);
		System.out.println("size of the array is "+num1.length);
		System.out.println("Valueof 0 position "+num1[0]);
		int temp=100;
		for(int i=0;i<num1.length;i++) {
			num1[i]=temp;
			temp++;
		}
		System.out.println("for each or enhanced loop");
		for(int n:num1) {
			System.out.println(n);
		}
	}

}
