package Map_Interface;
import java.util.Map;
import java.util.*;
public class Program7 {
	public static void main(String[] args) {
		Map<String,Integer> m1=new HashMap<>();
		m1.put("abc", 10);
		m1.put("pqr", 11);
		m1.put("xyz", 12);
		m1.put("cde", 15);
		String s="abc";
		m1.put(s, 100);
		String s1=new String("pqr");
		m1.put(s1, 200);
		System.out.println(m1);
		
		for(Map.Entry<String,Integer> x:m1.entrySet())
		System.out.println(x);
	}

}
