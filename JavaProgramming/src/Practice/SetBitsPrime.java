package Practice;

import java.util.Scanner;

public class SetBitsPrime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start");
		int start=sc.nextInt();
		System.out.println("Enter the end");
		int end=sc.nextInt();
		for(int i=start;i<=end;i++) {
		setBit(i);
		}
		sc.close();
	}
	public static void setBit(int n) {
		int count=0;
		int n1=n;
		while(n1>0) {
			if(n1%2==1)
				count++;
			n1=n1/2;
		}
		if(isPrime(count))
			System.out.println(n+" has "+count+" set bits which is prime");
		else
			System.out.println(n+" has "+count+" set bits which is not prime");
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

}
