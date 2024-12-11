package Comparable_Interface;
import java.util.*;
public class Driver {
	public static void main(String[] args) {
		List<Car>l1=new ArrayList<>();
		Car c1=new Car("Tata",121,13567.78);
		l1.add(c1);
		l1.add(new Car("Tata",122,23456.60));
		l1.add(new Car("Maruti",123,33456.50));
		l1.add(new Car("MG",124,43456.70));
		l1.add(new Car("Kia",125,53456.30));
		System.out.println(l1);
		System.out.println("UnSorted Elements");
		for(Car x:l1)
			System.out.println(x);
		Collections.sort(l1);
		System.out.println("Sorted Elements");
		for(Car x:l1)
			System.out.println(x);
	}

}
