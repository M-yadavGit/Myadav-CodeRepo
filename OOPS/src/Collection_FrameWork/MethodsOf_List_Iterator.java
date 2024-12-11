package Collection_FrameWork;
import java.util.*;
import java.util.ListIterator;
public class MethodsOf_List_Iterator {
	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(55);
		l1.add(44);
		l1.add(67);
		System.out.println(l1);
		ListIterator lit=l1.listIterator();
		System.out.println("Creation of ListIterator Cursor");
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println("=====================================");
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	
	}
	

}
