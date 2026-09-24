package com.listexamples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ListExamples {
	public static void main(String[] args) {
//		// primitive array 
//		int num[]=new int[10];
//		num[0]=100;
//		num[1]=200;
//		System.out.println(num);
//		// ArrayList 
//		ArrayList al = new ArrayList();
//		al.add(10);		// auto-boxing : converting primitive to object. 
//		al.add(20);
//		al.add("Ravi");
//		al.add(100.40);
//		al.add(true);
//		System.out.println(al);
//		Object obj = al.get(1);
//		Integer i = (Integer)obj;		// down level type casting 
//		int n = i.intValue();			// converting integer object to primitive 
//		System.out.println(n);
//		// ArrayList with generics 
//		ArrayList<Integer> al1 = new ArrayList<Integer>();
//		al1.add(10);
//		al1.add(20);
//		al1.add(30);
//		//al1.add("Ravi");
//		int n1 = al1.get(0);   // auto-unboxing : converting object to primitive. 
		
		// ArrayList 
		
//		ArrayList<String> names = new ArrayList<String>();
//			System.out.println("number of names are "+names.size());
//		names.add("Ravi");
//		names.add("Raj");
//		names.add("Mahesh");
//		names.add("Rajesh");
//		names.add("Ravi");
//		System.out.println(names);
//			names.add(2,"Balaji");
//		System.out.println(names);
//		System.out.println("number of names are "+names.size());
//		System.out.println("Search "+names.contains("Raj"));
//		System.out.println("Search "+names.contains("Raju"));
//		names.remove(0);		// remove using index 
//		names.remove("Rajesh");	// remove using value. 
//		System.out.println("number of names are "+names.size());
//		// LinkedList 
		
//		LinkedList<String> names = new LinkedList<>();
//			names.addFirst("LOkesh");
//			names.add("Raj");
//			names.add("Ravi");
//			names.add(2,"Dinesh");
//			names.add("Akash");
//			names.addLast("Mahesh");
//			System.out.println(names);
	// Vector : Vector is known as legacy class. by default all method in 
		// Vector are synchronized. 
		
		Stack<Integer> ss = new Stack<>();
		ss.push(100);		// add the elements 
		ss.push(200);
		ss.push(300);
		ss.push(400);
		System.out.println(ss);
		System.out.println("Pop "+ss.pop());		// remove top most element 
		System.out.println(ss);
		System.out.println("Peek "+ss.peek());      // display top most element but doesn't remove 
		System.out.println(ss);
		System.out.println("Size "+ss.size());
		System.out.println("Search "+ss.search(300));
		System.out.println("Search "+ss.search(10000));
	}
}
