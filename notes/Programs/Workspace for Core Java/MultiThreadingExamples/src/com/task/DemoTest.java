package com.task;

class Task implements Runnable {
	@Override
	public void run() {
	Thread t = Thread.currentThread();
	String name = t.getName();
	System.out.println("Inside run method "+name);
	for(int i=0;i<=10;i++) {
		System.out.println(name+"'s car is moving with speed as "+(i+60)+"km/hr");
		try {
		Thread.sleep(500);
		}catch(Exception e) {}
	}	
	}
}
public class DemoTest {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("Inside main method "+t);
		Task tt = new Task();
		Thread t1 = new Thread(tt);
		Thread t2 = new Thread(tt);
		Thread t3 = new Thread(tt);
		Thread t4 = new Thread(tt);
		t1.setName("Ravi"); t2.setName("Raj"); t3.setName("Mahesh"); t4.setName("Ajay");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
