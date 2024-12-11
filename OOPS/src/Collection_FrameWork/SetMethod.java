package Collection_FrameWork;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SetMethod {
	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(11);
		l1.add(22);
		l1.add(33);
		l1.add(32);
		l1.add(76);
		System.out.println("Original list: "+l1);
		ListIterator lit=l1.listIterator();
		while(lit.hasNext()) {
			int p=(int)lit.next();
			if(p%2==1)
				lit.set(p*2);
		}
		System.out.println("updated list: "+l1);
		
	}
}
