package Recursion;

import java.util.Scanner;

public class Program12 {
	static int fact=1;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int fact=getFact(n);
		System.out.println(fact);
	}
	public static int getFact(int n) {
		if(n>0) {
			fact=fact*n;
			getFact(n-1);
		}
		return fact;
	}
}
	
