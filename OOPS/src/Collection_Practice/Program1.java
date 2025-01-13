package Collection_Practice;

import java.util.ArrayList;
import java.util.Collection;

public class Program1 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(20);
		c1.add(45);
		c1.add(56);
		c1.add(34.5);
		c1.add("Mohan");
		System.out.println(c1);
		for(Object x:c1) {
			System.out.println(x);
		}
	}

}
