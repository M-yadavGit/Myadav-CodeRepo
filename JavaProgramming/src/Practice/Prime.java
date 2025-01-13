package Practice;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println(isPrime(num));
		sc.close();
	}
		public static boolean isPrime(int n) {
			if(n<2)
				return false;
			for(int i=2;i*i<n;i++) {
			if(n%i==0)
				return false;
			}
			return true;
		}
}
