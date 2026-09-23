package interface_example;

public class PaymentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Payment payment;            // creating reference of interface. 

        payment = new UpiPayment();

        payment.pay(1000);
        payment.refund(200);


        payment = new CardPayment();

        payment.pay(2000);
        payment.refund(500);
	}

}

interface A {
	
}

interface B {
	
	
}

interface C extends A,B {
	
}
class Test implements C{
	
}















