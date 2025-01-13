package Conversion_Programs;
import java.util.Scanner;
public class BinaryToDecimal {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	String result=binaryToDecimal(n);
	System.out.println(n+ " of "+result);
}
	public static String binaryToDecimal(int n) {
		int dec=0;
		int twomul=1;
		while(n>0) {
			int rem=n%10;
			if(rem>1)
				return "You are not entered a valid number";
			else
			dec=rem*twomul +dec;
		n=n/10;
		twomul=2*twomul;
		}
	return "Decimal number is: "+dec;
	}
}
