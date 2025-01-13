package String;
import java.util.Scanner;
public class Program4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.next();
		if(isPalindrome(s1))
			System.out.println("String is palindrome");
		else
			System.out.println("String is Not Palindrome");
	}
	public static boolean isPalindrome(String s1) {
		int mid=s1.length()/2;
		for(int i=0;i<mid;i++) {
			if(s1.charAt(i)!=s1.charAt(s1.length()-1-i))
			return false;
		}
		return true;
	}
}
