package Comparable_Interface;
import java.util.*;
public class Car implements Comparable<Car> {
	String Brand_name;
	int car_no;
	double price;
	
	Car(){	
	}
	
	Car(String Brand_name,int car_no, double price){
		this.Brand_name=Brand_name;
		this.car_no=car_no;
		this.price=price;
	}
	public String toString() {
		return Brand_name+"\t"+car_no+"\t"+price;
	}
//	public int compareTo(Car c) {
//		return this.car_no-c.car_no;
//	}
	/*
	public int compareTo(Car c) {
		return (int)(this.price-c.price);
	}
*/

	public int compareTo(Car c) {
		if(this.Brand_name.equalsIgnoreCase(c.Brand_name))
			return (int)(this.price-c.price);
		return this.Brand_name.compareToIgnoreCase(c.Brand_name);
	}

}
