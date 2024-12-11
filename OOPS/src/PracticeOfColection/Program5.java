package PracticeOfColection;

import java.util.Collection;

import java.util.*;

public class Program5 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(10);
		c1.add(100);
		c1.add(120);
		c1.add("mohan");
		c1.add(200);
		System.out.println(c1);
		Iterator itr=c1.iterator();
		int big=Integer.MIN_VALUE;
		int small=Integer.MAX_VALUE;
		while(itr.hasNext()) {
			Object o=itr.next();
			if(o instanceof Integer) {
			int temp=(Integer)o;
			if(temp>big)
				big=temp;
			if(temp<small)
				small=temp;
			}						
		}
		System.out.println(big);
		System.out.println(small);
		
	}
		
	

}
