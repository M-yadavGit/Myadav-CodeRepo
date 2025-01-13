package Recursion;

import java.util.Scanner;

public class Program14 {
	static int count=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		getDigit(n);
		System.out.println(count);
	}
	public static void getDigit(int n) {
		if(n>0) {
		count++;
		getDigit(n/10);
		}
		
	}

}
