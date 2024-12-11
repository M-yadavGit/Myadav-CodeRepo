package Map_Interface;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class Program4 {
	public static void main(String[] args) {
		Map<Integer,String> m1=new HashMap<>();
		m1.put(10, "abcd");
		m1.put(20, "pqr");
		m1.put(19, "xyz");
		m1.put(30, "abcdef");
		m1.put(15, "qwe");
		System.out.println(m1);
		
		Collection<String> c1=m1.values();
		System.out.println(c1);
		
		for(String x:c1)
			System.out.println(x);
		
		
	}

}
