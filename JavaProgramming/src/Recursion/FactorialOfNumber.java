package Recursion;

import java.util.Scanner;

public class FactorialOfNumber {
	static int Fact=1;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		getFactorial(n);
	}
	public static void getFactorial(int n) {
		if(n>0) {
		Fact=Fact*n;
		getFactorial(n-1);
		}
		else
			System.out.println(Fact);
		
	}

}
