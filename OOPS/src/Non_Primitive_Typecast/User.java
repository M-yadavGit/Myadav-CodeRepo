package Non_Primitive_Typecast;

public class User {
	public static void main(String[] args) {
		Game g=new Game();
		Vehicle v1=g.SelectVehicle();
		if(v1 instanceof Car)			
		{
			System.out.println("Car Object");
			Car car=(Car)v1;
			System.out.println(car.a);
			System.out.println(car.b);
		}
		else if(v1 instanceof Bus) {
			System.out.println("Bus Object");
			Bus bus=(Bus)v1;
			System.out.println(bus.c);
			System.out.println(bus.d);
		}
		else {
			System.out.println("Bike Object");
			Bike bike=(Bike)v1;
			System.out.println(bike.e);
			System.out.println(bike.f);
		}
	}

}
