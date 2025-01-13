package TekPyramidPrograms;

public class FibonacciSeries {
	public static void main(String[] args) {
		getFibonacci(5);
	}
	public static void getFibonacci(int n) {
		int n1=0;
		int n2=1;
		System.out.print(n1+" "+n2+" ");
		for(int i=0;i<n-2;i++) {
			int n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
			
		}
	}

}