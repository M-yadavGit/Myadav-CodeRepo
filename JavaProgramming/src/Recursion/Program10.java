package Recursion;

import java.util.Scanner;

public class Program10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		test(n);
		
	}
	public static void test(int n) {
		if(n>0) {
			//System.out.println(n);
			test(n-1);
		}
		System.out.println(n);
	}

}
