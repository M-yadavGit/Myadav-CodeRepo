package Collection_FrameWork;
import java.util.*;
public class ToPrintLargestAndSmallestInteger {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(10);
		c1.add(22);
		c1.add(222);
		c1.add(200);
		System.out.println("Collection c1: "+c1);
		Iterator itr=c1.iterator();
		int s_int=Integer.MAX_VALUE;
		int b_int=Integer.MIN_VALUE;
		while(itr.hasNext()) {
			Object o=itr.next();
			if(o instanceof Integer) {
				int temp=(int)o;
			if(temp>b_int)
				b_int=temp;
			if(temp<s_int)
				s_int=temp;
			}	
		}
		System.out.println(s_int);
		System.out.println(b_int);
	}

}
