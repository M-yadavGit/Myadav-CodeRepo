import java.util.Scanner;
public class HCF {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter the 1st number");
		int a=sc.nextInt();
		System.err.println("Enter the 1st number");
		int b=sc.nextInt();
		System.err.println("Enter the 1st number");
		int c=sc.nextInt();
		int result=getHCF(a,b,c);
		System.err.println("HCF of "+a+" ,"+b+" ,"+" and "+c+" is: "+result);
		
	}
	public static int getHCF(int a,int b,int c) {
	int small = (a<b)?(a<c?a:c):(b<c?b:c);
	for(int i=small;;i--) {
		if(a%i==0 && b%i==0 && c%i==0)
			return i;
	}
}
}
