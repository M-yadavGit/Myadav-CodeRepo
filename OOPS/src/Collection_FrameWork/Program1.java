package Collection_FrameWork;

import java.util.*;

public class Program1 {
	public static void main(String [] args) {
		int [] a=new int[100];
		Collection c1=new ArrayList();
		c1.add(21);
		c1.add(240);
		c1.add("Mohan");
		c1.add(20.8);
		c1.add(100);
		System.out.println(c1);
		Iterator itr=c1.iterator();
		while(itr.hasNext()) {
			Object o=itr.next();
			if(!(o instanceof Integer)) {
				itr.remove();
	}
			}
		System.out.println(c1);

}
}
