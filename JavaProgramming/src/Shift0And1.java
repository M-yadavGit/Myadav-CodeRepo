//you are given an integer number which cintains only 1 and 0.WAJP to shift all 0's to left side and all 1's to right side and print it.
import java.util.Scanner;
public class Shift0And1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Start number");
		int n=sc.nextInt();
		String result=shift01(n);
		System.out.println(result);
		
}
	public static String shift01(int n) {
		String res="";
		while(n>0) {
			int rem=n%10;
			if(rem==1) 
				res=res+rem;
			else
				res=rem+res;
			n=n/10;
		}
		return res;
	}
}