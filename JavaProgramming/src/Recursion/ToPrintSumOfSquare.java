package Recursion;

public class ToPrintSumOfSquare {
	static int sum=0;
	public static void main(String[] args) {
	getSquareNumberSum(1);
}
	public static void getSquareNumberSum(int n) {
		if(n<=100) {
			sum=sum+n*n;
			getSquareNumberSum(n+1);
		}
		else
			System.out.println(sum);
	}
}
