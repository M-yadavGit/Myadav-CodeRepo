package Array_Assignment;

public class Program45 {
	public static void main(String[] args) {
		int [] a= {2,5,7,9,9,15};
		System.out.println("Array a is: ");
		for(int x:a)
			System.out.print(x+" ");
		System.out.println();
		String b=isArraySorted(a);
		System.out.println(b);
		
	}
	public static String isArraySorted(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1])
				return "Not sorted";
		}
		return "sorted";
		
	}
}