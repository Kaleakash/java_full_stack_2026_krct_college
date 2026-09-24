package com;

public class ThrowsExample {

	static void dis1() throws Exception{
		//try {
		int result = 100/1;
		//}catch(Exception e) {}
		System.out.println("dis1 method");
	}
	static void dis2() throws Exception{
		//try {
		dis1();
		//}catch(Exception e) {}
		System.out.println("dis2 method");
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//try {
		dis2();
		//}catch(Exception e) {}
		System.out.println("main method");
		
	}

}
