package Map_Interface;
import java.util.*;

public class Program3 {
	public static void main(String[] args) {
		Map<Integer,String> m1=new HashMap<>();
		m1.put(12, "abc");
		m1.put(20, "pqr");
		m1.put(10, "xyz");
		m1.put(30, "wer");
		m1.put(50, "abcde");
		System.out.println(m1);
		
		//to get All values values()
		Collection <String> c1=m1.values();
		System.out.println(c1);
		
		//to iterate
		Iterator<String> itr=c1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
