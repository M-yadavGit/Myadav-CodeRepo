package Collection_FrameWork;

import java.util.*;

public class Program4 {
	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(10);
		l1.add(1, 50);
		l1.add(0, 100);
		System.out.println("List 1st is: "+l1);
		List l2=new ArrayList();
		l2.add(220);
		l2.add(1, 550);
		l2.add(0, 110);
		System.out.println("List 2nd is: "+l2);
		l1.addAll(1, l2);
		System.out.println("Updated List 1st is: "+l1);
		l2.add(3,null);
		System.out.println(l2);
		l2.add(4,null);
		l1.remove(0);
		System.out.println(l1);
		System.out.println(l1.get(0));
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		
	}
}
