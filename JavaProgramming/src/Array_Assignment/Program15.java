package Array_Assignment;

public class Program15 {
	public static void main(String[] args) {
		int[] a= {10,27,39,40,50};
		System.out.println("Array Element");
		for(int x:a) {
			System.out.println(x+" is "+((x%2==0)?"even":"odd"));
			}
	}
}