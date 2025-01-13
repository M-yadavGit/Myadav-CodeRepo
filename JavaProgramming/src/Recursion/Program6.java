package Recursion;

public class Program6 {
	public static void main(String[] args) {
		test(1);
	}
	public static void test(int n) {
		if(n<=100) {
		System.out.println(n);
			test(n+1);
		}
	}

}
