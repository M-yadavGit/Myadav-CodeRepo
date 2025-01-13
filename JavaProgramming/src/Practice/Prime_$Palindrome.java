package Practice;

import java.util.Scanner;

public class Prime_$Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start");
		int start=sc.nextInt();
		System.out.println("Enter the end");
		int end=sc.nextInt();
		for(int i=start;i<end;i++){
		if(palindrome(i))
		System.out.println(i+"number is palindrome");
//		else
//			System.out.println("number is not palindrome");
		}
	}
	public static boolean palindrome(int n) {
		int num=n;
		int rev=0;
		//while(num>0) {
		for(;num>0;num=num/10) {
		int rem=num%10;
		rev=10*rev+rem;
		//num=num/10;
		
		}
		return n==rev;
		
	}

}
