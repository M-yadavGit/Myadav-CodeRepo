package Array_Programs;

public class Insertion_Sort {
	public static void main(String[] args) {
		int [] a= {85,56,50,23,34};
		System.out.println("Array before sorting");
		for(int x:a)
		System.out.print(x+" ");
		sortArray(a);
		System.out.println("\nAarray after sorting");
		for(int p:a)
		System.out.print(p+" ");
	}
	public static void sortArray(int[] a) {
		int n=a.length;
		for(int i=1;i<n;i++) {
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		
	}

}
