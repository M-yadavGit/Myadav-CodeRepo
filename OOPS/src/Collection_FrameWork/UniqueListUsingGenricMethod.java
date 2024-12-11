package Collection_FrameWork;
import java.util.*;
public class UniqueListUsingGenricMethod {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(10);
		l1.add(10);
		l1.add(23);
		l1.add(29);
		l1.add(12);
		l1.add(23);
		l1.add(12);
		System.out.println("List l1 is:"+l1);
		List<Integer> l=getUniqueList(l1);
		System.out.println(l);
	}
	public static List<Integer> getUniqueList(List<Integer> l1){
		List<Integer> a=new ArrayList<>();
		for(int p:l1) {
			if(!a.contains(p))
				a.add(p);
		}
		
	return a;
	}

}
