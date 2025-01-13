package Practice;

public class Inserstion_Sort2 {
	public static void main(String[] args) {
		int [] a= {100,339,22,48,300,298};
		System.out.println("Array Before sorted");
		for(int x:a)
			System.out.print(x+" ");
		System.out.println("\nArray After sort");
		sortArray(a);
		for(int x:a)
			System.out.print(x+" ");
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
