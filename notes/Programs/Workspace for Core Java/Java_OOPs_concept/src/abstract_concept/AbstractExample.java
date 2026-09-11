package abstract_concept;


abstract class Bike {
	abstract void speed();
		
		void mailage() {
			System.out.println("Mailage : 40km/lt");
		}
}
class Pulsar extends Bike {
	
	@Override
	void speed() {
		System.out.println("Pulsar Speed : 90km/hr");
	}
}
public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bb = new Pulsar();
		bb.speed();
		bb.mailage();
	}

}
