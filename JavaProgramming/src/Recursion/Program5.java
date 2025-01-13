package Recursion;

public class Program5 {
	public static void main(String[] args) {
		test(1);
		
	}
	public static void test(int n) {
		if(n<=10) {
			System.out.println(n);
			test(n+1);
		}
			System.out.println(n);
	}
}
