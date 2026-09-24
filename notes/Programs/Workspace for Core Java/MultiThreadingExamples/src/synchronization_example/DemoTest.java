package synchronization_example;
class BookingTicket implements Runnable {
	int avl = 3;
	@Override
	public synchronized void run() {
	Thread t= Thread.currentThread();
	String name = t.getName();
	if(avl>0) {
		System.out.println(name+" got the ticket");
		avl = avl-1;
	}else {
		System.out.println(name+" sorry no ticket");
	}
	}
}
public class DemoTest {
	public static void main(String[] args) {
		BookingTicket bt1 = new BookingTicket();		// new memory of avl = 3
		//BookingTicket bt2 = new BookingTicket();		// new memory of avl = 3
		//BookingTicket bt3 = new BookingTicket();		// new memory of avl = 3
		//BookingTicket bt4 = new BookingTicket();		// new memory of avl = 3
		//BookingTicket bt5 = new BookingTicket();		// new memory of avl = 3
		Thread t1 = new Thread(bt1,"Raj");
		Thread t2 = new Thread(bt1,"Ravi");
		Thread t3 = new Thread(bt1,"Ramesh");
		Thread t4 = new Thread(bt1,"Rajesh");
		Thread t5 = new Thread(bt1,"Ram");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
