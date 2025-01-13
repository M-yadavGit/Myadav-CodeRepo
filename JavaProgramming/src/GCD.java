import java.util.Scanner;
public class GCD {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the 1st number");
	int a=sc.nextInt();
	System.out.println("Enter the 2nd number");
	int b=sc.nextInt();
	System.out.println("Enter the 3rd number");
	int c=sc.nextInt();
	int gcd=getGCD(a,b,c);
	System.out.println("GCD of "+a+" ,"+b+" ,"+c+" is: "+gcd);
}
public static int getGCD(int a,int b, int c ) {
	int x= a<b?a:b;
	int small=x<c?x:c;
	for(int i=small;;i--) {
		if(a%i==0 && b%i==0 && c%i==0)
			System.out.println(i);
			return i;
			
	}
}
}
