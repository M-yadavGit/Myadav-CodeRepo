package Array_Assignment;

import java.util.Scanner;

public class Program13 {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		System.out.println("Array Element");
		for(int x:a)
			System.out.print(x+" ");
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the index of element");
		int index=sc.nextInt();
		System.out.println("Enter the value of index");
		int value=sc.nextInt();
		int [] b=insertElement(a,index,value);
		System.out.println("Updated Array Element");
		for(int x:b)
			System.out.print(x+" ");
		sc.close();
	}
	public static int[] insertElement(int[] a,int index,int value) {
		int[] b=new int[a.length+1];
		b[index]=value;
		for(int i=0;i<a.length;i++) {
		if(i<index)
			b[i]=a[i];
		else
			b[i+1]=a[i];
		}
		return b;
	}

}
