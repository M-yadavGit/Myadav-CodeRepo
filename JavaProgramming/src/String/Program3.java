package String;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.next();
		System.out.println(isPalindrome(s1));
	}
	public static boolean isPalindrome(String s1) {
	
	String rev="";
	for(int i=0;i<s1.length();i++) {
		char ch=s1.charAt(i);
		rev=ch+rev;
		
	}
	System.out.println(rev);
	return rev.equals(s1);
	}
}
