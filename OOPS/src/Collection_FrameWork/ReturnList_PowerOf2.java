package Collection_FrameWork;
import java.util.*;
public class ReturnList_PowerOf2 {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList();
		l1.add(10);
		l1.add(2);
		l1.add(4);
		l1.add(32);
		l1.add(39);
		l1.add(23);
		System.out.println("Element of List l1: "+l1);
		List<Integer> l=getListPowerOf2( l1);
		System.out.println(l);
	}
	public static List<Integer> getListPowerOf2(List<Integer> l1){
		List<Integer> a=new ArrayList<>();
		for(int p:l1) {
			if(isPowerOfTwo(p))
				a.add(p);
		}
		return a;
	}
	public static boolean isPowerOfTwo(int n) {
		return (n&(n-1))==0;
		 
	}
}
