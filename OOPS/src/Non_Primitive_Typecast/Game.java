package Non_Primitive_Typecast;
import java.util.Scanner;
public class Game {
	public Vehicle SelectVehicle() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Select your choice");
	System.out.println("Press 1 for -------> Car");
	System.out.println("Press 2 for -------> Bus");
	System.out.println("Press 3 for -------> Bike");
	int choice=sc.nextInt();
	switch(choice) {
			case 1:
				System.out.println("You have selected car");
				Car c1=new Car();
				return c1;

			case 2:
				System.out.println("You have selected bus");
				Bus b1= new Bus();
				return b1;
			case 3:
				System.out.println("You have selected Bike ");
				return new Bike();
			default:
				System.out.println("Invalid choice");
				return SelectVehicle();
					
	}
}
	

}
