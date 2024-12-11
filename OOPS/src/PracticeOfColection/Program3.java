package PracticeOfColection;

import java.util.Collection;
import java.util.*;

public class Program3 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(10);
		c1.add(20);
		c1.add(10);
		c1.add(20);
		c1.add("Mohan");
		c1.add(10.2);
		System.out.println(c1);
		Iterator itr= c1.iterator();
		int sum=0;
		while(itr.hasNext()) {
			Object o=itr.next();
			
			if(o instanceof Integer) {
				sum=sum+(int)o;
			}
		}
		System.out.println(sum);
	}

}
