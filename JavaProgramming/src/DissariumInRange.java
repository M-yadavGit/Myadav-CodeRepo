import java.util.Scanner;
public class DissariumInRange {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int start=sc.nextInt();
	System.out.println("Enter the Number");
	int end=sc.nextInt();
	for(int i=start; i<=end;i++) {
		if(isDissarium(i))
			System.out.println(i+" it is a dissarium number");
	}
}
	public static boolean isDissarium(int n) {
		int sum=0;
		int a=n;
		int digit=getCount(n);
			while(n>0) {
				sum=sum+(int)Math.pow(n%10, digit);
				digit--;
				n=n/10;
			}
		return sum==a;
		}
	public static int getCount(int n) {
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
	return count;
	}
	

}
