import java.util.Scanner;
public class CountSumOfPrime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Start range");
		int start=sc.nextInt();
		System.out.println("Enter the End range");
		int end=sc.nextInt();
		int sum=0;
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) {
				sum=sum+i;	
			}
		}
			System.out.println(sum);
		
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