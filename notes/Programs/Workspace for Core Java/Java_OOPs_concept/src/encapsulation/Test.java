package encapsulation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//amount = -35000;
		Account acc = new Account();
//		acc.accno=100;
//		acc.name="Raj";
//		acc.amount=-35000;
		acc.setValue(100, "Raj", -35000);
		acc.display();
	}

}
