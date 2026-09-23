package interface_example;

class CardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println(
            "Paid ₹" + amount + " using Card"
        );
    }
    @Override
    public void refund(double amount) {
        System.out.println(
            "Refunded ₹" + amount + " through Card"
        );
    }
}
