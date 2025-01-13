package Practice;

import java.util.Scanner;

public class Pattaer1 {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number");
//		int n=sc.nextInt();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j<i)
			System.out.print("  ");
				else
					System.out.print("* ");
		}
			System.out.println();
		}
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//			System.out.print("* ");
//		}
//			System.out.println();
//		}
//		int n=5;
////		int space=n-1;
////		int star=n;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=space;j++) {
//				System.out.print(" ");
//		}
//			for(int j=1;j<=star;j++) {
//				System.out.print("* ");
//		}
//			
//			System.out.println();
//		}
		
	}

}
