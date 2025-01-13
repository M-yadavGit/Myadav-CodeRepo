import java.util.Scanner;
public class PrimeSetBits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the left number");
		int left=sc.nextInt();
		System.out.println("Eneter the right number");
		int right=sc.nextInt();
		PrimeSetBits sb=new PrimeSetBits();
		int result=sb.countPrimeSetbits(left, right);
		System.out.println(result);
	}
	
	public int countPrimeSetbits(int left, int right) {
		int count=0;
		for(int i=left; i<=right;i++) {
			int setbits=0;
			int p=i;
			while(p>0) {
				if(p%2==1)
					setbits++;
				p=p/2;
			}
		if(isPrime(setbits))
			count++;
		}
		return count;
		
	}
	public static boolean isPrime(int n) {
		if(n<2)
			return false;
		for(int i=2; i*i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}
