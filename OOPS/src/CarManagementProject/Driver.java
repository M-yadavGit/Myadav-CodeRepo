package CarManagementProject;
import java.util.*;
public class Driver {
	public static void main(String[] args) {
		List<Car> l1=new ArrayList<>();
		Car c1=new Car("Tata",2021,202292929.0,"CNG","Punch");
		Car c2=new Car("Maruti",2020,302292929.0,"Petrol","Swift");
		l1.add(c1);
		l1.add(c2);
		l1.add(new Car("Maruti",2020,302292929.0,"Petrol","Baleno"));
		l1.add(new Car("Maruti",2020,302292929.0,"Petrol","Grand Vitara"));
		l1.add(new Car("Honda",2021,102292929.0,"Petrol","city"));
		l1.add(new Car("Mahendra",2020,55292929.0,"Petrol","Thar"));
		l1.add(new Car("KIA",2020,892929.0,"Petrol","seltos"));
		System.out.println(l1);
	}

}
