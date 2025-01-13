package Practice;

public class Car extends Vehicle {
	Car(){
		System.out.println("Car no-ars constructor");
	}
	Car(int p){
		super(9);
		System.out.println("Car int arg constructor");
	}

}
