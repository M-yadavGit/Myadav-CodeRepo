package Collection_FrameWork;

import java.util.Collection;
import java.util.ArrayList;


public class MethodsOfCollectionInterface {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(10);
		c1.add(22);
		c1.add(30);
		c1.add(40);
		System.out.println("Collection c1: "+c1);
		System.out.println(c1.size());
		Collection c2=new ArrayList();
		c2.add(10);
		c2.add(20);
		c2.add(40);
		c2.add("Mohan");
		System.out.println("Collection c2: "+c2);
		System.out.println(c2.size());
		c1.addAll(c2);
		System.out.println("Updated c1: "+c1);
		c1.remove(10);
		System.out.println("After removed: "+c1);
		c1.removeAll(c2);
		System.out.println(c1);
		c2.retainAll(c1);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1.contains(22));
		c1.clear();
		
		
		
	}

}
