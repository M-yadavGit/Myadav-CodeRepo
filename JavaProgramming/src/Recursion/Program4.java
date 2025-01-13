package Recursion;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1st Number");
		int n1=sc.nextInt();
		System.out.println("Enter the 2nd Number");
		int n2=sc.nextInt();
		System.out.println("Enter the 3rd Number");
		int n3=sc.nextInt();
		System.out.println("Enter the 4th Number");
		int n4=sc.nextInt();
		System.out.println("Enter the 5th Number");
		int n5=sc.nextInt();
		int Big=getBig(getBig(n1,n2),getBig(n3,getBig(n4,n5)));
		System.out.println(Big);
		
	}
	public static int getBig(int a,int b) {
		int big=a>b?a:b;
		return big;
	}

}
