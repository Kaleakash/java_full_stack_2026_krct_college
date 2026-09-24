package com.map_examples;

import java.net.MulticastSocket;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Unorder 
		//Map<Integer, String> mm = new HashMap<Integer, String>();
		// Order 
		//Map<Integer, String> mm = new LinkedHashMap<Integer, String>();
		// Sorted by Key by default ASC 
		Map<Integer, String> mm  = new TreeMap<Integer, String>();
		// Hashtable : legacy class like vector by default methods are 
		// synchronized. 
		mm.put(2, "Ravi");
		mm.put(1, "Mahesh");
			mm.put(2, "Raj");// if we pass same key then it replace with new value. 
		mm.put(3, "Rajesh");
		mm.put(5, "Mahesh");
		System.out.println(mm);
		System.out.println("Get VAlue "+mm.get(1));
		System.out.println("search "+mm.containsKey(2));
		System.out.println("search "+mm.containsValue("Rajesh"));
	}

}
