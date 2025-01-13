package Recursion;
import java.util.Scanner;
public class PalindromeNumber {
	static int rev=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean rev=toReverse(n);
		System.out.println(n+" is palindrome: "+rev);
	}
	public static boolean toReverse(int n) {
		int n1=n;
		if(n>0) {
			rev=rev*10+n%10;
			toReverse(n/10);
		}
		return rev==n1;
	}
	
}
