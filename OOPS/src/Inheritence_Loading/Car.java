package Inheritence_Loading;

public class Car extends Vehicle {
	int x=20;
	
	
	{
		System.out.println("This is car non-static block");
	}
	
	Car(){
		System.out.println("This is a car constructor");
	}
	
	static
	{
		System.out.println("This is Car static block");
	}

}
