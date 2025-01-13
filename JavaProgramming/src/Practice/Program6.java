package Practice;

public class Program6 {
	static int x=10;
	public static void test() {
		int x=20;
		System.out.println(x);
		System.out.println(Program6.x);
	}
	public static void main(String[] args) {
		Program6 p1=new Program6();
		p1.test();
	}

}
