import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if (isPrime(n))
			System.out.println(n + " is a prime number");
		else
			System.out.println(n + " is not a prime number");
	}

	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		int i = 2;
		while (i * i <= n) {
			if (n % i == 0)
				return false;
			i++;
		}
		return true;
	}
}
