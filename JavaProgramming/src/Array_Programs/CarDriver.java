package Array_Programs;

public class CarDriver {
	public static void main(String[] args) {
		Car c=new Car("Audi");
		Car [] c1= {new Car("TATA"),new Car("Maruti"),new Car("Mahendra")};
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c1[0].name);
		System.out.println(c1[2].name);
		System.out.println(c1[1].name);
		System.out.println(c.name);



	}

}
