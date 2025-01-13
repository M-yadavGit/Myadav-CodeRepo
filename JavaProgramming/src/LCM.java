import java.util.Scanner;
public class LCM {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd number");
		int b=sc.nextInt();
		System.out.println("Enter the 3rd number");
		int c=sc.nextInt();
		int gcd=getLCM(a,b,c);
		System.out.println("LCM of "+a+" ,"+b+" ,"+c+" is: "+gcd);
	}
	public static int getLCM(int a,int b, int c ) {
		int x= a>b?a:b;
		int big=x>c?x:c;
		for(int i=big;;i+=big) {
			if(i%a==0 && i%b==0 && i%c==0)
				return i;
		}
	}
}
