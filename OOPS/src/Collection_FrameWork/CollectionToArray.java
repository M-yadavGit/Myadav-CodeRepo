package Collection_FrameWork;

import java.util.Collection;
import java.util.ArrayList;

public class CollectionToArray {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(10);
		c1.add(22);
		c1.add(30);
		c1.add(34);
		Object [] o=c1.toArray();
		for(int i=0;i<c1.size();i++) {
			System.out.println(o[i]);
		}
		System.out.println("-------------------------------");
		for(Object o1:c1)
			System.out.println(o1);
		
		
	}

}
