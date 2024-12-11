package Collection_FrameWork;
import java.util.*;
public class MethodsOfList {
	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(10);
		l1.add(10);
		l1.add("Mohan");
		l1.add(33.4);
		l1.add(0, 11);
		l1.add(1, 11);
//		List l2=new ArrayList();
//		l2.add(10);
//		l2.add(33);
//		l2.add("Mohan");
//		l2.add(33.4);
//		l2.add(0, 11);
		System.out.println("List l1: "+l1);
//		l1.addAll(l2);
//		System.out.println("Add List l1 + List l2: "+l1);
//		l1.remove(0);
//		System.out.println(l1);
//		System.out.println(l1.get(0));
//		System.out.println(l1.indexOf(33));
//		System.out.println(l1.lastIndexOf(10));
		l1.set(0, 15);
		System.out.println(l1);
		
	}

}
