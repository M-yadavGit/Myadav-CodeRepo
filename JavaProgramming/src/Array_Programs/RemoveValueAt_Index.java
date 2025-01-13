package Array_Programs;
import java.util.*;
public class RemoveValueAt_Index {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] a= {10,20,30,10,40,50};
		System.out.println("Enter the index value: ");
		int index=sc.nextInt();
		System.out.println("Before removed");
		for(int p:a)
		System.out.print(p+" ");
		int [] b=removeElement(a,index);
		System.out.println("\nUpdated value");
		for(int x:b)
			System.out.print(x+" ");
	}
	public static int[] removeElement(int[] a,int index) {
		int[] b=new int[a.length-1];
		for(int i=0;i<a.length;i++) {
			if(i<index)
				b[i]=a[i]; 
			else if(i>index)
			b[i-1]=a[i];
			
		}
		return b;
	}
}
