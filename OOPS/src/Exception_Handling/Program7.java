package Exception_Handling;

import java.util.Scanner;

public class Program7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a=sc.nextInt();
		System.out.println("Enter the 1st number");
		int b=sc.nextInt();
		System.out.println("Start");
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		try {
		System.out.println(a+"/"+b+"="+(a/b));
		}
		catch(Exception e) {
			System.out.println(a+"/"+b+"="+"Infinity");
		}
		System.out.println(a+"*"+b+"="+(a*b));
		
		System.out.println("End");
		
	}

}
