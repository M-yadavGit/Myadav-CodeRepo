package Practice;

import java.util.Scanner;

public class Fib {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter number");
		int n=sc.nextInt();
		getFib(n);
	}
	public static void getFib(int n) {
		int n1=0;
		int n2=1;
		System.out.print(n1+" "+n2+" ");
		for(int i=1;i<=n-2;i++) {
			int n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	
	}

}
