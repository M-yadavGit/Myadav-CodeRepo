package Collection_Practice;

import java.util.*;

public class Program3 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add(10);
		c1.add(45);
		c1.add(56.7);
		c1.add("Mohan");
		c1.add("abc");
		c1.add(55);
		System.out.println("c1 is: "+c1);

		
		Iterator itr = c1.iterator();
		while (itr.hasNext()) {
			Object x = itr.next();
			if (!(x instanceof Integer))
				itr.remove();

		}
		System.out.println(c1);

	}

}
