package com.queue_examples;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
	// LinkedList Queue 
		
		Queue<Integer> q1  = new LinkedList<Integer>();
		q1.add(4);q1.add(1);q1.add(3);q1.add(5);q1.add(6);
		System.out.println(q1);
		System.out.println("remove "+q1.poll()); // remove element from head 
		System.out.println(q1);
		System.out.println("-----------------");
		Queue<Integer> q2 = new PriorityQueue<Integer>();
		q2.add(4);q2.add(1);q2.add(3);q2.add(5);q2.add(6);
		System.out.println(q2);
		System.out.println("remove "+q2.poll()); // remove element from head 
		System.out.println(q2);
	}

}
