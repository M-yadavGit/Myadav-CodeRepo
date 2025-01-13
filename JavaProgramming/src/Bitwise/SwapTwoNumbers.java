package Bitwise;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=sc.nextInt();
		System.out.println("Enter the Number");
		int b=sc.nextInt();
		swapTwoNumber(a,b);
		sc.close();
		}
	
		public static void swapTwoNumber(int a,int b) {
			a=a^b;
			b=a^b;
			a=a^b;
			System.out.println(a);
			System.out.println(b);
		}
}
