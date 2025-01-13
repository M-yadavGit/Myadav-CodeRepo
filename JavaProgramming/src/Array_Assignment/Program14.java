package Array_Assignment;

import java.util.Scanner;

public class Program14 {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		System.out.println("Array Element");
		for(int x:a)
			System.out.print(x+" ");
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the index of element");
		int index=sc.nextInt();
		int [] b=removeElement(a,index);
		System.out.println("Updated Array Element");
		for(int x:b)
			System.out.print(x+" ");
		sc.close();
	}
	public static int[] removeElement(int[] a,int index) {
		int[] b=new int[a.length-1];
		for(int i=0;i<a.length-1;i++) {
		if(i<index)
			b[i]=a[i];
		else if(i>=index)
			b[i]=a[i+1];
		}
		return b;
	}

}
