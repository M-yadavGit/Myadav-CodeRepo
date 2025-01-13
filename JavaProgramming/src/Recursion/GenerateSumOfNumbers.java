package Recursion;

public class GenerateSumOfNumbers {
	static int sum=0;
	public static void main(String[] args) {
		getSum(1);
	}
	public static void getSum(int n) {
		if(n<=1000) {
			sum=sum+n;
			getSum(n+1);
			}
		else
		System.out.println(sum);
	}

}
