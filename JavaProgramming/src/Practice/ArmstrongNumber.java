package Practice;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting number");
		int start=sc.nextInt();
		System.out.println("Enter the ending number");
		int end=sc.nextInt();
		for(int i=start; i<=end;i++) {
			if(isArmsStrong(i))
				System.out.println(i+" is an armstrong number");
		}
	}
	public static boolean isArmsStrong(int n) {
		int sum=0;
		int num=n;
		int count=countDigit(n);
		while(n>0) {
			int rem=n%10;
			sum=sum+(int)(Math.pow(rem,count));
			n=n/10;
		}
		return sum==num;
	}
	public static int countDigit(int n) {
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		return count;
		
	}
}
