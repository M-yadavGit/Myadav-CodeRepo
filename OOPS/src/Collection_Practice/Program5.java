package Collection_Practice;

import java.util.*;

public class Program5 {
	public static void main(String[] args) {
		int big=Integer.MIN_VALUE;
		int small=Integer.MAX_VALUE; 
		Collection c1=new ArrayList();
		c1.add(10);
		c1.add(30);
		c1.add(45);
		c1.add(89);
		c1.add(30);
		for(Object x:c1) {
			if((int)x>big)
				big=(Integer)x;
			if((int)x<small)
				small=(Integer)x;
		}
		System.out.println(big);
		System.out.println(small);
	}

}
