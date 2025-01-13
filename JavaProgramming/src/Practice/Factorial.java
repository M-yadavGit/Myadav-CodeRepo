package Practice;

import java.util.Scanner;

public class Factorial {
	
	static int fact = 1;
	
	public static void main(String[] args)
	{		
		System.out.println("Enter The Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("The Factorial of " +n+ " is " +fact(n) );
	}
	public static int fact(int n)
	{
		if (n==0 || n==1)
		{
			return 1;
		}
		else
		{
			for (int i=1; i<=n;i++)
			{
				fact = fact*i;
				
			}
		}
		return fact;
		
	}

}


//Why do we go for popup : To give the information to the enduser.
/// To grab the attention of the enduser