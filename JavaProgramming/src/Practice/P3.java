package Practice;

import java.util.Scanner;

public class P3 {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,60};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the times");
		int k=sc.nextInt();
		
		for(int x:a)
			System.out.print(x+" ");
		System.out.println();
		
		rightRotate(a,k);
		
		for(int x:a)
			System.out.print(x+" ");
	}
	public static void rightRotate(int[] a,int k) {
		for(int j=1;j<=k;j++) {
		int temp=a[0];
		for(int i=0;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
		}
	}

}
