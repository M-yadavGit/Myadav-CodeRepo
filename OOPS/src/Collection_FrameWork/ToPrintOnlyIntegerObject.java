package Collection_FrameWork;
import java.util.*;

public class ToPrintOnlyIntegerObject {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40.0);
		c1.add("Mohan");
		System.out.println("Collection c1: "+c1);
		Iterator itr=c1.iterator();
		while(itr.hasNext()) {
			Object o=itr.next();
			if(o instanceof Integer) {
				System.out.println(o);
			}
		}
		
	}

}
