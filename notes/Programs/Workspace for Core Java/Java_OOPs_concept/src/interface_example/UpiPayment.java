package interface_example;

public class UpiPayment implements Payment{
	
	@Override
    public void pay(double amount) {
        System.out.println(
            "Paid ₹" + amount + " using UPI"
        );
    }
    @Override
    public void refund(double amount) {
        System.out.println(
            "Refunded ₹" + amount + " through UPI"
        );
    }
}
