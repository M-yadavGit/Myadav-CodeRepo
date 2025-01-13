import java.util.Scanner;
public class HappyInrange {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the start Number");
			int start=sc.nextInt();
			System.out.println("Enter the end Number");
			int end=sc.nextInt();
			for(int i=start;i<=end;i++) {
				if(isHappy(i))
					System.out.println(i+" it is a Happy number");
			}
}
		public static boolean isHappy(int n) {
			while(n>9) {
				int sum=0;
				while(n>0) {
					int rem=n%10;
					sum=sum+rem*rem;
				n=n/10;
				}
				n=sum;
			}
			return n==1 || n==7;
		}
}
