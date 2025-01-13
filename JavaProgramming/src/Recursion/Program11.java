package Recursion;

import java.util.Scanner;

public class Program11 {
	static int sum=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=getSum(n);
		System.out.println(sum);
	}
	public static int getSum(int n) {
		if(n>0) {
			sum=sum+n;
			getSum(n-1);
		}
			return sum;
	}

}
