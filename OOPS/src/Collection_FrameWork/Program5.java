package Collection_FrameWork;
import java.util.*;
public class Program5 {
public static void main(String[] args) {
	List<Integer> l1=new ArrayList<>();
	l1.add(23);
	l1.add(46);
	l1.add(47);
	l1.add(55);
	l1.add(45);
	l1.add(78);
	System.out.println(l1);
	ListIterator<Integer>lit=l1.listIterator();
	System.out.println(lit.next());
	System.out.println(lit.previous());
	System.out.println("======================");
	System.out.println(lit.next());
	System.out.println(lit.next());
	System.out.println(lit.next());
	System.out.println(lit.next());
	System.out.println(lit.next());
	System.out.println(lit.next());
}
}
