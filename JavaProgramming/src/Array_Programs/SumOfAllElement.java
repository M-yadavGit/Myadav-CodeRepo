package Array_Programs;

public class SumOfAllElement {
	public static void main(String[] args) {
		int sum=0;
		int [] a= {10,20,30,40,50};
		for(int p:a)
			System.out.print(p+" ");
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("\nSum of Elements: "+sum);
		System.out.println("Average of Elements: "+sum/5);
	}

}
