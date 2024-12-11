package Inheritence_Loading;

public class ElectricCar extends Car {
	{
		System.out.println("This is Electric car non-static block");
	}
	
	static
	{
		System.out.println("This is Electric Car static block");
	}
	
	ElectricCar(){
		System.out.println("This is a Electric car constructor");
	}
}
