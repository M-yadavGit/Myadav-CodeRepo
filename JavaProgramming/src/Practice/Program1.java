package Practice;

class Program1{
	public static void main(String[] args) {
		//int n=4;
		System.out.println(power(4));
	}
	public static boolean power(int n) {
		return n>0 && (n&(n-1))==0;
	}
}
