package String;

import java.util.Scanner;

public class PalindromeWithoutReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.nextLine();
		System.out.println(isPalindrome(s1));
		
	}
	public static boolean isPalindrome(String s) {
		s=s.toLowerCase();
		int len=s.length();
		for(int i=0;i<len/2;i++) {
			char ch=s.charAt(i);
			if(ch!=s.charAt(len-1-i))
				return false;
		}
		return true;
	}

}
