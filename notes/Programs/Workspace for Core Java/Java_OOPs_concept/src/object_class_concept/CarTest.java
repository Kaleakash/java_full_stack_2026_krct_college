package object_class_concept;

public class CarTest {
	public static void main(String[] args) {
//		Car santro = new Car();		// heap memory created...
//		santro.start();
//		santro.stop();
//		
//		Car innova = new Car();	// new heap memory created.
//		innova.start();
//		innova.moving();
//		innova.stop();
		
		Car innova = new Car();
		innova.displayCarDetails("Innova");
		innova.wheel=4;
		innova.color="White";
		innova.price=4000000;
		innova.displayCarDetails("Innova");
		
		System.out.println("----");
		Car ertiga = new Car();
		ertiga.displayCarDetails("Innova");
		ertiga.wheel=4;
		ertiga.color="Gray";
		ertiga.price=1500000;
		ertiga.displayCarDetails("Ertiga");
		
		Car santro = new Car(4,1100000,"RED");
		santro.displayCarDetails("Santro");
	}
}





