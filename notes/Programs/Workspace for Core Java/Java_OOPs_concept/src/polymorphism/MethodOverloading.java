package polymorphism;
class Calculator {
//	void abc() {
//	System.out.println(10+20);
//	}
//	void display() {
//		System.out.println(10+20);
//	}
	void add() {
		System.out.println(10+20);
	}
	void add(int x) {
		System.out.println(x+20);
	}
	void add(int x, int y) {
		System.out.println(x+y);
	}
	void add(String x, String y) {
		System.out.println(x+y);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Calculator c1 = new Calculator();
			c1.add();
			c1.add(100);
			c1.add(100,200);
			c1.add("1","2");
	}

}
