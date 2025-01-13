//WAJP to shift even digit to left side and odd digit to the right side and print it.
import java.util.Scanner;
public class ShiftEvenAndOdddigit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();
	String result=getEvenOddDigit(n);
	System.out.println(result);
	
}
public static String getEvenOddDigit(int n) {
	String even="";
	String odd="";
	while(n>0) {
		int rem=n%10;
	if(rem%2==0)
		even=rem+even;
	else
		odd=rem+odd;
	n=n/10;
}
	return (even+odd);
}
}
