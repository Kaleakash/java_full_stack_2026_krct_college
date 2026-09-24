package com;

public class DefaultThreadInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println(t);
		// default srno, name, priority and group 
		t.setName("My Demo Thread");
		t.setPriority(1);  // range of priority 1 to 10 
		System.out.println(t);
		ThreadGroup tg = t.getThreadGroup();
		System.out.println(tg);
		int i = t.getPriority();
		String name = t.getName();
		System.out.println(i+" "+name);
		t.setPriority(Thread.MAX_PRIORITY);  // max = 10, min = 1, norm = 5 
		System.out.println(t);
	}

}
