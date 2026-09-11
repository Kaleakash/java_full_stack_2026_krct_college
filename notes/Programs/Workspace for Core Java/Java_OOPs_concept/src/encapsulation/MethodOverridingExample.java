package encapsulation;
class Bike {
	void speed() {
		System.out.println("Speed : 60km/hr");
	}
}
class Pulsar extends Bike {
	//@Override
	void mailage() {
		System.out.println("Mailage : 40km/lt");
	}
	@Override
	void speed() {
		System.out.println("Pulsar Speed : 90km/hr");
	}
}
class Honda extends Bike {
	void mailage() {
		System.out.println("Mailage : 55km/lt");
	}
}

public class MethodOverridingExample {

	public static void main(String[] args) {
		Pulsar pu = new Pulsar();
//		Honda hh = new Honda();
		pu.speed();	pu.mailage();
		//hh.speed();hh.mailage();
		
		Bike bb = new Pulsar();
		bb.speed();
		//bb.mailage();

	}

}
