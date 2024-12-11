package Collection_FrameWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ToPrintLargestAndSmallestString {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(10);
		c1.add("Vipin");
		c1.add("Saurabh");
		c1.add("Sanjeew");
		c1.add("Mithlesh");
		c1.add(40.0);
		c1.add("Mohan");
		System.out.println("Collection c1: "+c1);
		Iterator itr=c1.iterator();
		int count=0;
		String small_st="";
		String big_st="";
		while(itr.hasNext()) {
			Object o=itr.next();
			if(o instanceof String) {
				count++;
			String temp=(String)o;
			if(count==1)
			small_st=temp;
		if(temp.length()>big_st.length())
		big_st=temp;
		if(temp.length()<small_st.length())
		small_st=temp;
		}
		}
		System.out.println(big_st);
		System.out.println(small_st);		
}
}
