package Collection_Practice;
import java.util.*;
public class Program4 {
	public static void main(String[] args) {
		int sum=0;
		Collection c1=new ArrayList();
		c1.add(10);
		c1.add(45);
		c1.add(89);
		c1.add(54);
		for(Object x:c1) {
			if((x instanceof Integer)) {
				sum=sum+(int)x;
			}
		}
		System.out.println(sum);
		
	}

}
