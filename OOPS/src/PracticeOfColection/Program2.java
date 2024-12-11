package PracticeOfColection;
import java.util.*;
public class Program2 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		int x=23;
		c1.add(x);
		c1.add(c1);
		c1.add(10);
		c1.add(20.2);
		c1.add(200);
		c1.add(new Car());
		Car c3=new Car();
		c1.add(c3);
		System.out.println(c1);
		Iterator itr = c1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	}
}
