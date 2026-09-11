package inheritance;

class A {						// super class, base class or parent class. 
	void dis1() {
		System.out.println("dis1 method part of A class");
	}
}

class B extends A{				// sub class, derived class or child class. 
	void dis2() {
		System.out.println("dis2 method part of B class");
	}
}
public class DemoTest {
	public static void main(String[] args) {
	
		A obj1 = new A();
		B obj2 = new B();
		obj1.dis1();
		obj2.dis2();
		obj2.dis1();
	}
}
