package Collection_FrameWork;
import java.util.*;

public class CreateListWhereOddNumberMakeItDouble {
	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(23);
		l1.add(89);
		l1.add(43);
		ListIterator lit=l1.listIterator();
		for(int i=0;i<l1.size();i++) {
			int x=(int)l1.get(i);
			if(x%2==1)
			l1.set(i, 2*x);
		}
		System.out.println(l1);
	}

}
