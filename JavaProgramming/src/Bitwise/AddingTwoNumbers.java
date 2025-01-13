package Bitwise;
import java.util.Scanner;
public class AddingTwoNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		System.out.println("Enter the number");
		int b=sc.nextInt();
		int sum=getSum(a,b);
		System.out.println(sum);
		
	}
	public static int getSum(int a,int b) {
		if(a==0)
			return b;
		if(b==0)
			return a;
		while(b!=0) {
			int carry=a&b;
			a=a^b;
			b=carry<<1;
		}
		return a;
	}
	

}
