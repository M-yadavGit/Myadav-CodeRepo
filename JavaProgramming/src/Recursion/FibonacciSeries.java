package Recursion;

import java.util.Scanner;

public class FibonacciSeries {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	for(int i=0;i<=n;i++) 
		System.out.println(getFibonacci(i)+" ");
	
	
}
	public static int getFibonacci(int n) {
		if(n<=1)
			return n;
		else {
			return getFibonacci(n-1) + getFibonacci(n-2);
		}
}
}
