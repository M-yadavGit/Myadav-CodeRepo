package Array_Assignment;

public class Program42 {
	public static void main(String[] args) {

		int [] a= {12,23,15,15,23,12};
		System.out.println("Before sort Array");
		for(int x:a)
			System.out.print(x+" ");
		System.out.println();
		System.out.println(sortArray(a));
	}
	public static boolean sortArray(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1])
				return true;
		}
		return false;
			
	}
}
