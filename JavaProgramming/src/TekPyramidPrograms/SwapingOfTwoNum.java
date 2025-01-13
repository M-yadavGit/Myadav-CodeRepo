package TekPyramidPrograms;

public class SwapingOfTwoNum {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		swappedNumber(a,b);
	}
	public static void swappedNumber(int a,int b) {
		System.out.println("initial value of a: "+a);
		System.out.println("initial value of b: "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Updated value of a: "+a);
		System.out.println("Updated value of b: "+b);
		
	}
	

}
