package Recursion;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1st Number");
		int n1=sc.nextInt();
		System.out.println("Enter the 2nd Number");
		int n2=sc.nextInt();
		System.out.println("Enter the 3rd Number");
		int n3=sc.nextInt();
		int Big=getBig(n1,getBig(n2,n3));
		System.out.println(Big);
		
	}
	public static int getBig(int a,int b) {
		int big=a>b?a:b;
		return big;
	}

}
