package Array_Assignment;

import java.util.Scanner;

public class Program20 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		System.out.println("Array Elements");
		for(int x:a)
			System.out.print(x+" ");
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the k times value");
		int k=sc.nextInt();
		leftRotate(a,k);
		System.out.println("left Rotate Array Elements");
		for(int x:a)
			System.out.print(x+" ");

	}
	public static void leftRotate(int[]a,int k) {
		int n=a.length;
		for(int j=0;j<=k;j++) {
			int temp=a[0];
			for(int i=0;i<n-1;i++) {
				a[i]=a[i+1];	
			}
		a[a.length-1]=temp;
		}

	}
}