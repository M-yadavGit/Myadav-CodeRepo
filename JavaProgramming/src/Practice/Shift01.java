package Practice;
import java.util.Scanner;

public class Shift01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start");
		int n=sc.nextInt();
	
		shift01(n);
}
	public static void shift01( int n) {
		String res="";
		while(n>0) {
			int rem=n%10;
			if(rem%2==0)
			res=rem+res;
			else
				res=res+rem;
			n=n/10;
		}
		System.out.println(res);
		
	}
}
