package Recursion;

public class Program8 {
	public static void main(String[] args) {
		test(100);
		
	}
	public static void test(int n) {
		if(n>0) {
			System.out.println(n);
			test(n-1);
		}
	}

}
