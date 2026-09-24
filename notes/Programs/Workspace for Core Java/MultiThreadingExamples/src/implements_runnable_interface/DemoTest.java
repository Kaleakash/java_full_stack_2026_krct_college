package implements_runnable_interface;

class MyTask1 implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("i "+i);
		}
	}
	
}
class MyTask2 implements Runnable {
	@Override
	public void run() {
		for(int j=0;j<=10;j++) {
			System.out.println("j "+j);
		}
	}
}
public class DemoTest {

	public static void main(String[] args) {
	MyTask1 obj1 = new MyTask1();
	MyTask2 obj2 = new MyTask2(); 
	
	Thread t1 = new Thread(obj1);		// thread class object. 
	Thread t2 = new Thread(obj2);		// thread class object. 
	t1.start();
	t2.start();
	}

}
