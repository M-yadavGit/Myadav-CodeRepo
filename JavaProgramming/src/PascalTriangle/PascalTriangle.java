package PascalTriangle;
	import java.util.Scanner;
	public class PascalTriangle {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Number");
			int n=sc.nextInt();
			getPascalTriangle(n);

		}
		public static void getPascalTriangle(int n) {
			int space=n-1;
			for(int i=1;i<=n;i++)
			{
			for(int j=1;j<=space;j++) {
					System.out.print("  ");
			}
				getCombination(i);
				space--;
			
			System.out.println();
			
		}
	}
	public static void getCombination(int n) {
		
		for(int j=0;j<n;j++) {
			int comb=1;
			for(int i=0;i<j;i++) {
			comb=(comb*(n-1-i))/(i+1);
		}
		System.out.print(comb+" ");
	}
}}