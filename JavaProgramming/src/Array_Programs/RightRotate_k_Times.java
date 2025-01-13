package Array_Programs;

import java.util.Scanner;

public class RightRotate_k_Times {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a= {10,20,22,12,23,45};
		System.out.println("Before Right Rotate: ");
		for(int p:a)
			System.out.print(p+" ");
		System.out.println("\nEnter the rotate times");
		int k=sc.nextInt();
		
		rightRotate(a,k);
	}
	public static void rightRotate(int[] a,int k) {
		for(int j=0;j<k;j++) {
		int temp=a[a.length-1];
		for(int i=a.length-1;i>0;i--)
			a[i]=a[i-1];
		a[0]=temp;
		}
		for(int p:a)
			System.out.print(p+" ");
	}
}
