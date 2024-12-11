package Collection_FrameWork;

import java.util.*;

public class Program3 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(50);
		System.out.println(c1);
		Object [] x=c1.toArray();
		for(Object p:x) {
			System.out.println(p);
		}
		
	}

}
