package PracticeOfColection;

import java.util.Collection;
import java.util.*;

public class Program6 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(10);
		c1.add(200);
		c1.add(500);
		c1.add(29);
		c1.add(270);
		c1.add(300);
		Collection c2=new ArrayList();
		c2.add(10);
		c2.add(300);
		c2.add(29);
		System.out.println(c2);
		c2.addAll(c1);
		System.out.println(c1);
		System.out.println(c2);
		c1.remove(10);
		System.out.println(c1);
		System.out.println(c2.removeAll(c1));
		System.out.println(c2);
		System.out.println("==========================");
		System.out.println(c1);
		System.out.println(c2);
		c1.retainAll(c2);
		c2.retainAll(c1);
		System.out.println(c1);
		System.out.println(c2);
		
	}

}
