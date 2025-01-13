package Recursion;

import java.util.Scanner;

public class HCFByRecursion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		System.out.println("Enter b number");
		int b=sc.nextInt();
		System.out.println("Enter c number");
		int c=sc.nextInt();
		System.out.println(getHCF(a,getHCF(b,c)));
	}
	public static int getHCF(int a,int b) {
		int x=a<b?a:b;
		for(int i=x;;i--) {
			if(a%i==0 && b%i==0)
		return i;
		}
	}
}
