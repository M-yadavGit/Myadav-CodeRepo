package Collection_FrameWork;

import java.util.*;

public class ToPrintCollectionObject {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(12);
		c1.add(18);
		c1.add(22);
		c1.add(12.2);
		c1.add("Mohan");
		System.out.println("Collection c1: "+c1);
		System.out.println("==============Now i am generating the cursor=============");
		Iterator itr=c1.iterator();
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		System.out.println("----------------------------------------------------");
		Iterator itr2=c1.iterator();
		while(itr2.hasNext()) {
			Object o=itr2.next();
			System.out.println(o);
		}
		Collection c2=new ArrayList();
		c2.add(10);
		c2.add(20);
		c2.add(30);
		c2.add(40);
		c2.add(50);
		System.out.println("Collection c2: "+c2);
		
	}

}
