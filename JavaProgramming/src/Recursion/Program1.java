package Recursion;

public class Program1 {
	static int x=0;
	public static void main(String[] args) {
		test();
	}
	public static int test() {
		x++;
		if(x<10) {
			System.out.println(x);
			test();
	}
		return x;
	}
}
