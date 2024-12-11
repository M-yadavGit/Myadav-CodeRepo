package Collection_FrameWork;

import java.util.*;

public class Program2 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(50);
		Object [] x=c1.toArray();
		for(int i=0;i<c1.size();i++) {
			System.out.println(x[i]);
		}
		
	}

}
