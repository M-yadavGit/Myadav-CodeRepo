package Collection_Practice;

import java.util.ArrayList;
import java.util.Collection;

public class Program6 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add("ab");
		c1.add("aaa");
		c1.add("aaaa");
		c1.add("abcdpqr");
		c1.add("asdfgh");
		for(Object x:c1) {
			System.out.println(((String) x).length());
		}
	}

}
