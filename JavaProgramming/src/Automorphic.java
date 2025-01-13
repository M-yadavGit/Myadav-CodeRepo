import java.util.Scanner;
public class Automorphic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(isAutomorphic(n)) {
			System.out.println(n+ " it is a automorphic number");
		}else {
			System.out.println(n+" it is not a automorphic number");
		}
	}
	public static boolean isAutomorphic(int n) {
		int sq=n*n;
		while(n>0) {
			if(n%10!=sq%10)
				return false;
		n=n/10;
		sq=sq/10;
		
	}
		return true;
	}
}
