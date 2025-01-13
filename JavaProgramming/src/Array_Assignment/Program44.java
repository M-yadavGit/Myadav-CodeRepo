package Array_Assignment;

public class Program44 {
	public static void main(String[] args) {
		int [] a= {2,5,7,9,12,15};
		System.out.println("Array a is: ");
		for(int x:a)
			System.out.print(x+" ");
		System.out.println();
		String s=isArrayIncresingElement(a);
		System.out.println(s);
	}
	public static String isArrayIncresingElement(int[] a) {
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			if(a[i]>a[i+1])
				return "Array is not incresing order";	
		}
		return "Array is in increasing order";
	}
}
