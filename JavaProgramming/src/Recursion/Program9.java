package Recursion;

import java.util.Scanner;

public class Program9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		test(n);
		
	}
	public static void test(int n) {
		if(n>1) {
			System.out.println(n);
			test(n-1);
		}
	}

}
