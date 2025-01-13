import java.util.Scanner;
public class SwapingNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd number");
		int b=sc.nextInt();
		swapingNumber(a,b);
		
	}
	public static void swapingNumber(int a, int b) {
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("Updated value of a is: "+a);
		System.out.println("Updated value of b is: "+b);
		
	}
}
