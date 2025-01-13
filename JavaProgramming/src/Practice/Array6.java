package Practice;

import java.util.Scanner;

public class Array6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		int [] a=new int[size];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the element: "+(i+1));
			a[i]=sc.nextInt();
		}
		int small1=Integer.MAX_VALUE;
		int small2=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<small1) {
				small2=small1;
				small1=a[i];
			}
			else if(a[i]<small2 && a[i]!=small1) {
				small2=a[i];
			}
		}
		System.out.println(small1);
		System.out.println(small2);
	}

}

