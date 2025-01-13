package Pattern;
import java.util.Scanner;
public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		printPatternRow(n);
sc.close();
}
	public static void printPatternRow(int n) {
		for(int i=1;i<=n+2;i++) {
			for(int j=1;j<=n-2;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}