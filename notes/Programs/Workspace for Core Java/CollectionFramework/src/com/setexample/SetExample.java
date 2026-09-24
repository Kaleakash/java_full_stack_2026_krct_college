package com.setexample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// HashSet class base upon hashing,unorder  
		//HashSet<Integer> hs = new HashSet<Integer>();
		// node base and maintain the order. 
		//LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		//TreeSet<Integer> hs = new TreeSet<Integer>();
		//TreeSet hs = new TreeSet();
		HashSet hs = new HashSet();
		System.out.println("Size "+hs.size());
		System.out.println("is empty "+hs.isEmpty());
		hs.add(1);
		hs.add(100);
		hs.add(500);
		hs.add("a");
		hs.add(true);
		hs.add(3);
		hs.add(500);
		hs.add(200);
		hs.add(700);
		hs.add(2);
		hs.add(300);
		System.out.println("Size "+hs.size());
		System.out.println("is empty "+hs.isEmpty());
		System.out.println(hs);
		System.out.println("search "+hs.contains(1));
		System.out.println("search "+hs.contains(1000));
		hs.remove(3);
		System.out.println(hs);
	}

}
