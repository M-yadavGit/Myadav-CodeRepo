package PascalTriangle;
import java.util.Scanner;
public class PascalRow {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		getPascalRow(n);
	}
	public static void getPascalRow(int n) {
		for(int j=1;j<=n;j++) {
			getCombination(n-1,j-1);
		}
		
	}
public static void getCombination(int n, int r) {
	int comb=1;
	for(int i=0;i<r;i++) {
		comb=(comb*(n-i))/(i+1);
	}
	System.out.print(comb+" ");
}
}
