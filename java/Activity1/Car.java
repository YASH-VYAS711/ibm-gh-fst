package Activity1;

public class Car {
	String color, transmission;
	int make, tyres, doors;
	Car () {
		tyres=4;
		doors=4;
	}
	void displayCharacteristics() {
		System.out.println("Color: " + color);
		System.out.println("Transmission: " + transmission);
		System.out.println("Make: " + make);
		System.out.println("Tyres: " +  tyres);
		System.out.println("Doors: " + doors);
	}
	void accelarate() {
		System.out.print("Car is moving forward");
	}
	void brake() {
		System.out.print("Car has stopped");
	}
}
