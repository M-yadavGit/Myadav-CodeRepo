import java.util.Scanner;
public class CountBits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=getBits(n);
		System.out.println(count);	
	}

	public static int getBits(int n) {
		int count=0;
		while(n>0) {
			count++;
			n=n/2;
		}
	return count;
	}
}