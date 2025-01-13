import java.util.Scanner;
public class CountDigitsThatdivide {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		countDigit(n);
}
	public static void countDigit(int n) {
		int count=0;
		int rem=0;
		int i=n;
		while(n>0) {
			rem=n%10;
			if(i%rem==0) {
				count++;
			System.out.println(i+" is divided by :"+rem);
			}
			
			else {
				System.out.println(i+" is not divided by :"+rem);
			}
		n=n/10;
		}
		System.out.println(i+ "is divided by :"+count+" times");
		
		
	}

}
