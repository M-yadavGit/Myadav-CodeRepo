package Practice;
import java.util.Scanner;

public class PrimeRange {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int n1=sc.nextInt();
			System.out.println("Enter the number");
			int n2=sc.nextInt();
			
			for(int i=n1;i<n2;i++) {
			if(isPrime(i)) {
				System.out.println(i+" is Prime Number");
			}
//				else {
//				System.out.println(i+" is not Prime Number");
//			}
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




