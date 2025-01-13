import java.util.Scanner;
public class AlternatingBits {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	boolean result= hasAlternatingBits(n);
	System.out.println(n+" has Alternating Bits "+ result);
	
}
	public static boolean hasAlternatingBits(int n) {
		int bit=n%2;
		n=n/2;
		while(n>0) {
			if(bit==n%2)
				return false;
			bit=n%2;
			n=n/2;
		}
		return true;
	}
}
