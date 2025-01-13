package Practice;

import java.util.Scanner;

public class Swap {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a value");
			int a=sc.nextInt();
			System.out.println("Enter b value");
			int b=sc.nextInt();
			swap(a,b);
			
	}
		public static void swap(int a,int b) {
//			a=a+b;
//			b=a-b;
//			a=a-b;
			a=a^b;
			b=a^b;
			a=a^b;
			System.out.println("a = "+a);
			System.out.println("b = "+b);

		}

}
