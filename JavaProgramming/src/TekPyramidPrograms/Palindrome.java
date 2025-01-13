package TekPyramidPrograms;

public class Palindrome {
	public static void main(String[] args) {
		int n=121;
		System.out.println(reverseTheNumber(n));
	}
	public static boolean reverseTheNumber(int n) {
		int num=n;
		int rev=0;
		while(n>0) {
			rev=10*rev+n%10;
			n=n/10;
		}
		return rev==num;
	}
}
