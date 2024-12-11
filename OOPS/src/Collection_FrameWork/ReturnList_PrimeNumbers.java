package Collection_FrameWork;
import java.util.*;
public class ReturnList_PrimeNumbers {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(10);
		l1.add(34);
		l1.add(13);
		l1.add(17);
		l1.add(32);
		l1.add(7);
		l1.add(20);
		System.out.println("Elements of List l1: "+l1);
		List<Integer> l2=getPrimeList(l1);
		System.out.println(l2);
	}
	public static List<Integer> getPrimeList(List<Integer> l1){
		List<Integer> a=new ArrayList<>();
		for(int p:l1) {
			if(isPrime(p))
				a.add(p);
		}
		return a;
	}
	public static boolean isPrime(int x) {
		if(x<2)
			return false;
		else {
			for(int i=2;i*i<x;i++) {
				if(x%i==0)
					return false;
			}
			return true;
		}
	}
}
