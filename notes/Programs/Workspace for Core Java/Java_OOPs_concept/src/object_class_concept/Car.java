package object_class_concept;

public class Car {
	int wheel;
	float price;
	String color;		// instance variable 
	Car() {
		System.out.println("Car object created");
		wheel = 4;
		price = 800000;
		color = "Unkonwn";
	}
	Car(int wheel, float price, String color) {	// local variable 
		System.out.println("Car object created");
		this.wheel = wheel;
		this.price = price;
		this.color = color;
	}
	void start() {
		System.out.println("Car Start");
	}
	void appliedGear() {
		
	}
	void moving() {
		System.out.println("moving");
	}
	void stop() {
		System.out.println("Car Stop");
	}
	
	void displayCarDetails(String carName) {
		String msg="Car Info : "+carName;		// local variable 
		System.out.println(msg);
		System.out.println(" wheel "+wheel);
		System.out.println("Color "+color);
		System.out.println("Price "+price);
		
	}
}
