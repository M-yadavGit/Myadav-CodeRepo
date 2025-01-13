package Practice;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println(isPalindrome(num));
	}
	public static boolean isPalindrome(int n) {
//		int num=n;
		int rev=0;
//		while(num>0) {
//			rev=rev*10+num%10;
//			num=num/10;
//		}
//		return n==rev;
		for(int num=n;num>0;num=num/10) {
			rev=rev*10+num%10;	
		}
		return n==rev;
	}

}
