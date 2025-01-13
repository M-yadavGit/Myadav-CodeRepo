package Recursion;

public class Program7 {
	public static void main(String[] args) {
		test(1);
	}
	public static void test(int n) {
		if(n<=100) {
			test(n+1);
		}
		System.out.println(n);
	}

}
