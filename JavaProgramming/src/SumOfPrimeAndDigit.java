import java.util.Scanner;
	public class SumOfPrimeAndDigit {
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the Start number");
				int start=sc.nextInt();
				System.out.println("Enter the End number");
				int end=sc.nextInt();
				printPrime(start,end);
			}
			public static void printPrime(int start, int end) {
				int count=0;
				for(int i=start;i<=end;i++) {
					if(isPrime(i) && isPrime((getSum(i)))) {
						System.out.println(i+" ");
						count++;	
					}
				}
				System.out.print("\nTotal Prime Numbers from "+start+" to "+end+" is: "+count);			
		}
			public static boolean isPrime(int n) {
				if(n<2)
					return false;
				int i=2;
				while(i*i<=n) {
					if(n%i==0)
						return false;
					i++;				
				}
				return true;
		}
			public static int getSum(int n) {
				int sum=0;
				while(n>0) {
					sum=sum+n%10;
					n=n/10;
				}
				return sum;
			}
}
	
