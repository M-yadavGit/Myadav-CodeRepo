package Practice;

import java.util.Scanner;

public class PrimePalindrome {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the start");
			int start=sc.nextInt();
			System.out.println("Enter the end");
			int end=sc.nextInt();
			int count=0;
			for(int i=start;i<end;i++) {
				if(isPrime(i) && isPalindrome(i)) {
					System.out.println(i);
				count++;
				}
			}
			System.out.println("Total primePalindrome number is "+count);
			sc.close();
	}
	public static boolean isPrime(int n) {
		if(n<2) 
			return false;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static boolean isPalindrome(int n) {
		int rev=0;
		int num=n;
		while(n>0) {
			int rem=n%10;
			rev=10*rev+rem;
			n=n/10;
		}
		return num==rev;
	}
}
