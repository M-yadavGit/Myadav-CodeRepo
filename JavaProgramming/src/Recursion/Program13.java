package Recursion;

import java.util.Scanner;

public class Program13 {
	static int pow=1;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n1=sc.nextInt();
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int pow=getPow(n1,n);
		System.out.println(pow);
	}
	public static int getPow(int a,int b) {
		if(b>0) {
			pow=pow*a;
			getPow(a,b-1);
		}
		return pow;
	}
}
	
