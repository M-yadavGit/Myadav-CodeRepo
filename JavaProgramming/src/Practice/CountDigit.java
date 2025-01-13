package Practice;

import java.util.Scanner;

public class CountDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		countDigit(n);
		sc.close();
	}
	public static void countDigit(int n) {
		int count0=0;
		int count1=0;
		while(n>0) {
			if(n%2==0)
				count0++;
			else
				count1++;
			n=n/2;
		}
		System.out.println(count0);
		System.out.println(count1);
	}

}
