package Recursion;

import java.util.Scanner;

	public class CountDigit {
		static int count=0;
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number");
			int n=sc.nextInt();
			int count=getCountDigit(n);
			System.out.println(count);
			
			}
		public static int getCountDigit(int n) {
			if(n>0) {
				count++;
				n=n/10;
				getCountDigit(n);
			}return count;
		}
}