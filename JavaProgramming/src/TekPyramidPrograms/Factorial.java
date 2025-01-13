package TekPyramidPrograms;

public class Factorial {
	public static void main(String[] args) {

		getFactorial(5);
	}
	public static void getFactorial(int n) {
		int fact=1;
		for(int i=0;i<=n;i++) {
			if(i==0)
				System.out.println(i+"! is "+fact);
			else {
			fact=fact*i;
			System.out.println(i+"! is "+fact);
			}
		}
		
	System.out.println(fact);
	}
	

}
