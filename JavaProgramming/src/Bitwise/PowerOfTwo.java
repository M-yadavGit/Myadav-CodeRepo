package Bitwise;
import java.util.Scanner;
public class PowerOfTwo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean power=getPowerofTwo(n);
		System.out.println(power);
	}
	public static boolean getPowerofTwo(int n) {
		if(n<1)
			return false;
			return (n&(n-1))==0;
		
	}
	

}
