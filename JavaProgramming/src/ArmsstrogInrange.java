import java.util.Scanner;
public class ArmsstrogInrange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting number");
		int start=sc.nextInt();
		System.out.println("Enter the ending number");
		int end=sc.nextInt();
		for(int i=start; i<=end;i++) {
			if(isArmsStrong(i)) {
				System.out.println(i+" is a armstrong number");
			}
		}
	}
	public static boolean isArmsStrong(int n) {
		int num;
		num=n;
		int sum=0;
		int count=countDigit(n);
		while(num>0) {
			int rem=num%10;
			sum=sum+(int)Math.pow(rem, count);
			num=num/10;
		}
		return sum==n;
		
			
	}
	public static int countDigit(int n) {
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		return count;
	}
}
