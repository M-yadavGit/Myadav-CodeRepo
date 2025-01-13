package Bitwise;

import java.util.Scanner;

public class BinaryBitOfNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		String bin=getBin(n);
		System.out.println(bin);
	}
	public static String getBin(int n) {
		String bin="";
		while(n!=0) {
			bin=(n&1)+bin;
			n=n>>>1;
		}
		return bin;
	}

}
