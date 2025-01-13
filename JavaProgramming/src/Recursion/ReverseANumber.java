package Recursion;

import java.util.Scanner;

public class ReverseANumber {
	static String rev="";
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		String rev=toReverse(n);
		System.out.println(rev);
	}
	public static String toReverse(int n) {
		if(n>0) {
			rev=rev+n%10;
			toReverse(n/10);
		}
		return rev;
	}
	
}
