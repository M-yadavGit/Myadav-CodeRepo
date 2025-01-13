package Array_Programs;

public class Selection_Sort {
	public static void main(String[] args) {
		int [] a= {90,70,80,30,20,40};
		System.out.println("Array Befor Sort");
		for(int x:a)
			System.out.print(x+" ");
		sortArray(a);
		System.out.println("\nArray After Sort");
		for(int x:a)
			System.out.print(x+" ");
	}
	public static void sortArray(int[] a) {
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			int min_value=a[i];
			int ind=i;
			for(int j=i+1;j<n;j++) {
				if(a[j]<min_value) {
					min_value=a[j];
					ind=j;
			}
			}
				a[ind]=a[i];
				a[i]=min_value;
		}
	}
}
