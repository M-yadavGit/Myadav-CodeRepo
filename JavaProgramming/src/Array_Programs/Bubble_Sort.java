package Array_Programs;

public class Bubble_Sort {
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
			for(int i=0; i<n-1;i++) {
				int x=0; int temp;
				for(int j=0;j<n-1;j++) {
					if(a[j]>a[j+1]) {
						a[j]=a[j]^a[j+1];				//temp= a[j];
						a[j+1]=a[j]^a[j+1];				//a[j]=a[j+1];
						a[j]=a[j]^a[j+1]; 				//a[j+1]=temp;
						x++;
					}
				}
				if(x==0)
					return;
			}
		}
}
