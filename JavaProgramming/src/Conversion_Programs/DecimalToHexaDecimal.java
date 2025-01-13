package Conversion_Programs;
import java.util.Scanner;
public class DecimalToHexaDecimal {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	String result=DecimalToHexaDecimal(n);
	System.out.println(result);
	
}
public static String DecimalToHexaDecimal(int n) {
	String hex="";
	while(n>0) {
		int rem=n%16;
		if(rem<=9)
			hex=rem+hex;
		else
			hex=(char)(rem+87)+hex;
	n=n/16;
	}
	return hex;
}
}
