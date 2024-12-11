package Map_Interface;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class Program5 {
	public static void main(String[] args) {
		Map<Integer,String> m1=new HashMap<>();
		m1.put(10, "abcd");
		m1.put(20, "pqr");
		m1.put(19, "xyz");
		m1.put(30, "abcdef");
		m1.put(15, "qwe");
		System.out.println(m1);
		
		Set<Map.Entry<Integer, String>> s1=m1.entrySet();
		System.out.println(s1);
		
		//By iterator
		 Iterator<Map.Entry<Integer, String>>itr =s1.iterator();
		 while(itr.hasNext())
			 System.out.println(itr.next());
		 
		 //By for each loop
		for(Map.Entry<Integer, String> x:s1)
			System.out.println(x);
		
	}

}
