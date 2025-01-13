package Recursion;
import java.util.Scanner;
public class BiggetOfFour {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd number");
		int b=sc.nextInt();
		System.out.println("Enter the 3rd number");
		int c=sc.nextInt();
		System.out.println("Enter the 4th number");
		int d=sc.nextInt();
		int bigger=getBig(getBig(a,b),getBig(c,d));
		System.out.println(bigger);
}
	public static int getBig(int a,int b) {
		return a>b?a:b;
	}
}
