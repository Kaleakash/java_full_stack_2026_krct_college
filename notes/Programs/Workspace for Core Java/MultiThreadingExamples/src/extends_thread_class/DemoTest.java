package extends_thread_class;
class MyTask1 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("i "+i);
		}
	}
	
}
class MyTask2 extends Thread {
	@Override
	public void run() {
		for(int j=0;j<=10;j++) {
			System.out.println("j "+j);
		}
	}
}
public class DemoTest {
	public static void main(String[] args) {
		MyTask1 t1 = new MyTask1();		// thread object. 
		MyTask2 t2 = new MyTask2();   // Thread object. 
//		t1.run();
//		t2.run();
		t1.start();       // ready to run 
		t2.start();       // ready to run : Runnable state 
	}

}
