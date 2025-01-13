import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int n=sc.nextInt();
			if(getPerfect(n))
			{
				System.out.println("The number is perfect "+n);
			}
			else
			{
				System.out.println("The number is not a perfect "+ n);
			}

		}
		public static boolean getPerfect(int n)
		{
			int i=1;
			int sum=0;
			while(i<=n/2)
			{
				if(n%i==0)
					sum=sum+i;
				i++;
			}
			return n==sum;
		}
	}
