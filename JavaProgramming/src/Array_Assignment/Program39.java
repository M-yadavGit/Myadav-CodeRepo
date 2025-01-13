package Array_Assignment;

public class Program39 {
	public static void main(String[] args) {
		int [] a= {40,20,70,65,30,50,80};
		System.out.println("Array Elements");
		for(int x:a)
			System.out.print(x+" ");
		sortedArray(a);
		System.out.println("\nAfter sorted");
		for(int x:a)
			System.out.print(x+" ");
	}
	//By Bubble Sort
	/*public static void sortedArray(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					a[i]=a[i]^a[j];
					a[j]=a[i]^a[j];
					a[i]=a[i]^a[j];
				}
			}
		}
	}
	*/
	//By Insertion sort
	public static void sortedArray(int[] a) {
		for(int i=1;i<a.length;i++) {
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
