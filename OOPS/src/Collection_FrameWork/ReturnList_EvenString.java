package Collection_FrameWork;
import java.util.*;
public class ReturnList_EvenString {
	public static void main(String[] args) {
		List<String> l1=new ArrayList<>();
		l1.add("Mohan");
		l1.add("Sohan");
		l1.add("jack");
		l1.add("jones");
		l1.add("Ram");
		l1.add("roshan");
		System.out.println("All the elements of List String l1 are: "+l1);
		List<String> s=getEvenString(l1);
		System.out.println("Even List of String are: "+s);
		
	}
	public static List<String> getEvenString(List<String> l1){
		List<String> a=new ArrayList<>();
		for(String x:l1)
			if((x.length()%2)==0)
				a.add(x);
		return a;		
	}

}
