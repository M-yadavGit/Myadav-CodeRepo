package Recursion;

import java.util.Scanner;

public class SumOfDigit {
		static int sum=0;
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number");
			int n=sc.nextInt();
			int sum=getSumDigit(n);
			System.out.println(sum);
			
			}
		public static int getSumDigit(int n) {
			if(n>0) {
				sum=sum+n%10;
				n=n/10;
				getSumDigit(n);
			}return sum;
		}
}
