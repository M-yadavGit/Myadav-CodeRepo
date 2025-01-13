import java.util.Scanner;
	public class PerfectSquare {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int n=sc.nextInt();
			if(getPerfectSquare(n))
				System.out.println("The number is perfect square "+n);
			else
			{
				System.out.println("The number is not a perfect square "+ n);
			}

		}
		public static boolean getPerfectSquare(int n)
		{
			int i=1;
			while(i<=n)
			{
				if(i*i==n) {
					System.out.println(i);
				return true;
				}
				i++;
			}

			return false;
		}
	}

