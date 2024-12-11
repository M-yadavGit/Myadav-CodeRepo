package Collection_FrameWork;
import java.util.*;
public class ReturnArray_ofUniqueElements {
	public static void main(String[] args) {
		int[] a= {10,10,20,30,40,20,12,12,18};
		for(int x:a)
			System.out.println(x+" ");
		int[] unique=getUnique(a);
		for(int x:unique)
			System.out.println(x+" ");
}
	public static int[] getUnique(int[] a) {
		List<Integer> l=new ArrayList<>();
		for(int p:a) {
			if(!l.contains(p))
				l.add(p);
		}
	int[] x=new int[l.size()];
	for(int i=0;i<x.length;i++)
		 x[i]= l.get(i);
		
return x;
}
}

