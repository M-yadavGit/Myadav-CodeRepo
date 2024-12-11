package PracticeOfColection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Program1 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add(10);
		c.add("mohan");
		c.add(10.2);
		System.out.println(c);
		Iterator itr=c.iterator();
		while(itr.hasNext()) {
			Object element = itr.next();
			if(!(element instanceof Integer))
			{
				itr.remove();
			}
			System.out.println(element);
			
		}
		System.out.println(c);
	}

}
