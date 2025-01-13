package Recursion;
import java.util.Scanner;

public class PowerOfNumber {
	static int pow=1;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		System.out.println("Enter b number");
		int b=sc.nextInt();
		getPower(a,b);
	}
	public static void getPower(int a,int b) {
		if(b>0) {
			 pow=pow*a;
			getPower(a,b-1);
		}else
			System.out.println(pow);
		
	}
	}