package Conversion_Programs;
import java.util.Scanner;
public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		String result=decimalToBinary(n);
		System.out.println("Binary of "+n+" is: "+result);
	}
	public static String decimalToBinary(int n) {
		String bin="";
		while(n>0) {
			int rem=n%2;
			bin= rem+bin;
			n=n/2;
		}
	return bin;
	}
}
