package encapsulation;

public class Account {

private int accno;
private String name;
private float amount;

public void display() {
	System.out.println("Account Number "+accno);
	System.out.println("Customer Name "+name);
	System.out.println("Amount"+amount);
}

public void setValue(int accno,String name, float amount) {
	this.accno= accno;
	this.name = name;
	//this.amount = amount;
	if(amount<0) {
		this.amount = 500;
	}else {
		this.amount = amount;
	}
}

}
