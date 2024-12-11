package Inheritence_Loading;

public class Vehicle {
	
	Vehicle(){
		System.out.println("This is a vehicle constructor");
	}
	
	{
		System.out.println("This is vehicle non-static block");
	}
	
	static
	{
		System.out.println("This is vehicle static block");
	}
}
