package Conversion_Programs;
import java.util.Scanner;
public class OctalToDecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		String result=OctalToDecimal(n);
		System.out.println(result);
	}
	public static String OctalToDecimal(int n) {
		int dec=0;
		int eightmul=1;
		while(n>0){
			int rem=n%10;
			if(rem>8)
				return "you are entered a invalid Octal number";
			else
				dec=rem*eightmul+dec;
			n=n/10;
			eightmul=8*eightmul;
		}
	return "Decimal number is: "+dec;
	}
}
