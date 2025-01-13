package Practice;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a value");
			int a=sc.nextInt();
			System.out.println("Enter b value");
			int b=sc.nextInt();
			System.out.println("Enter c value");
			int c=sc.nextInt();
			getLcm(a,b,c);
	}
	public static void getLcm(int a,int b,int c) {
		int x=a>b?a:b;
		int big=x>c?x:c;
		for(int i=big;;i+=big) {
			if(i%a==0 && i%b==0 && i%c==0) {
				System.out.println(i);
			break;
			}
		}
	}

}
