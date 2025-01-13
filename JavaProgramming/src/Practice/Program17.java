package Practice;

import java.util.Scanner;

public class Program17 {
	public static void main(String[] args) {
		int[] a= {10,20,30,50};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index");
		int index=sc.nextInt();
		int [] x=removeElement(a,index);
		for(int p:x)
			System.out.print(p+" ");
	}
	public static int[] removeElement(int[] a,int index) {
		int [] b=new int[a.length-1];
			for(int i=0;i<a.length;i++) {
				if(i<index)
					b[i]=a[i];
				else if(i>index)
					b[i-1]=a[i];
			}
			return b;
	}
}
