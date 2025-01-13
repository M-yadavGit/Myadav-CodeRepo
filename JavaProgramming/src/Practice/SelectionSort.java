package Practice;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a= {15,10,20,5,45,35};
		System.out.println("Before sort Array: ");
		for(int x:a)
			System.out.print(x+" ");
		sortArray(a);
		System.out.println("\nAfter Sort array: ");
		for(int x:a)
			System.out.print(x+" ");
	}
	public static void sortArray(int[] a) {
		int n=a.length;
		for(int i=0;i<=n-1;i++) {
			int min_value=a[i];
			int index=i;
			for(int j=i+1;j<n;j++) {
				if(a[j]<min_value) {
					min_value=a[j];
					index=j;
				}
			}
			a[index]=a[i];
			a[i]=min_value;
		}
		
	}

}
