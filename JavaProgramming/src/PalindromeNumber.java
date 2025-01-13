import java.util.Scanner;
public class PalindromeNumber {
		 	public static void main(String[] args) {
		 		Scanner sc=new Scanner(System.in);
		 		System.out.println("Enter the the first range");
		 		int first=sc.nextInt();
		 		System.out.println("Enter the the last range");
		 		int last=sc.nextInt();
		 		printPrime(first,last);
		 	}
		 	public static void printPrime(int first, int last) {
		 		int count=0;
		 		for(int i=first;i<=last;i++) {
		 			if(isPrime(i)&& isPalindrome(i)){
		 				System.out.println(i);
		 				count++;
		 		}
		 		}
		 		System.out.println(count);
		 	}
		 	public static boolean isPalindrome(int n) {
		 		int num=n;
		 		int rev=0;
		 		while(n>0) {
		 			rev=10*rev+n%10;
		 			n=n/10;
		 		}
		 		return rev==num;
		 	}
		 	public static boolean isPrime(int n) {
		 		if(n<2)
		 			return false;
		 		int i=2;
		 		while(i*i<=n) {
		 			if(n%i==0)
		 				return false;
		 			i++;
		 		}
		 	return true;	
		 	}
}

