package Conversion_Programs;
import java.util.Scanner;
public class DecimalToOctal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		String result=decimalToOctal(n);
		System.out.println("Octal of "+n+" is: "+result);
	}
	public static String decimalToOctal(int n) {
		String oct="";
		while(n>0) {
			int rem=n%8;
			oct= rem+oct;
			n=n/8;
		}
	return oct;
	}
}
