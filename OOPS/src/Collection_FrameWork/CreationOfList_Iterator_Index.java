package Collection_FrameWork;
import java.util.*;
public class CreationOfList_Iterator_Index {
	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(10);
		l1.add(33);
		l1.add(42);
		l1.add(56);
		l1.add(54);
		System.out.println(l1);
		ListIterator lit=l1.listIterator();
		ListIterator lit1=l1.listIterator(3);
		System.out.println(lit.next());
		System.out.println(lit1.next());
		System.out.println(lit1.previous());
		while(lit1.hasPrevious()) {
			System.out.println(lit1.previous());
		}
	}

}
