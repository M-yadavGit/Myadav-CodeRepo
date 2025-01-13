package Bitwise;

import java.util.Scanner;

public class CountSetBit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		getCount(n);
	
	}
	public static void getCount(int n) {
		int count=0;
		while(n!=0) {
			int res=(n&1);
			if(res==1)
				count++;
			n=n>>>1;
		}
		System.out.println(count);
	}
}
