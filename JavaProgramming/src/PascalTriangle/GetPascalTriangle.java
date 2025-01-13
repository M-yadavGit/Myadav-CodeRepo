package PascalTriangle;
import java.util.Scanner;
public class GetPascalTriangle {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number");
	int n =sc.nextInt();
			getRow(n);
}
public static void getRow(int n) {
	for(int i=1;i<=n;i++) {
		
	for(int j=0;j<i;j++) {
		getComb(i-1,j);
	}
	System.out.println();
}}
public static void getComb(int n,int r) {
	int comb=1;
	for(int i=0;i<r;i++) {
		comb=comb*(n-i)/(i+1);
		
	}
	System.out.print(comb+" ");
}
}
