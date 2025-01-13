import java.util.Scanner;
public class CountPrimeNumber {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Start number");
			int n1=sc.nextInt();
			System.out.println("Enter the End number");
			int n2=sc.nextInt();
			int count=0;
			for(int i=n1;i<=n2;i++) {
				if(isPrime(i)) {
					System.out.println(i);
					count++;	
				}
			}
				System.out.println(count);
			
	}
		public static boolean isPrime(int n1) {
			if(n1<2)
				return false;
			int i=2;
			while(i*i<=n1) {
				if(n1%i==0)
					return false;
				i++;
				
			}
			return true;
	}
	}
