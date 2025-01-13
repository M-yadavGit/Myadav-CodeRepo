package Array_Assignment;

import java.util.Scanner;

public class Program18 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		System.out.println("Array Elements");
		for(int x:a)
			System.out.print(x+" ");
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the k times");
		int k=sc.nextInt();
		rightRotate(a,k);
		System.out.println("Right Rotate Array Elements");
		for(int x:a)
			System.out.print(x+" ");
		sc.close();
	}
	public static void rightRotate(int[]a,int k) {
		int n=a.length;
		for(int j=0;j<=k;j++) {
			int temp=a[n-1];
			for(int i=n-1;i>0;i--) {
					a[i]=a[i-1];	
			}
			a[0]=temp;
			
		}

		
		
	}
}