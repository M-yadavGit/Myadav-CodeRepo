package Practice;

import java.util.Scanner;

public class is_Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(isPrime(n)) {
			System.out.println(n+" is Prime Number");
		}else {
			System.out.println(n+" is not Prime Number");
		}
	sc.close();
	}
	
		public static boolean isPrime(int n) {
			if(n<2)
				return false;
			for(int i=2;i*i<=n;i++) {
				if(n%i==0)
					return false;
			}
			return true;
	}

}
