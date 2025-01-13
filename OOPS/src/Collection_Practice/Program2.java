package Collection_Practice;
import java.util.*;
public class Program2 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(10);
		c1.add(34);
		c1.add(45);
		c1.add(32.5);
		c1.add("Mohan");
		for(Object x:c1) {
			if((x instanceof Integer)) {
				System.out.println(x);
				
	}
		}
	}

}
