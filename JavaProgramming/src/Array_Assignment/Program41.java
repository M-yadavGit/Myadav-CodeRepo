package Array_Assignment;

public class Program41 {
	public static void main(String[] args) {
		//int[] a= {50,90,20,12,22,10,70,42,92,80,100,5,15,200};
		int [] a= {25,34,12,45,23,28};
		System.out.println("Before sort Array");
		for(int x:a)
			System.out.print(x+" ");
		sortArray(a);
		System.out.println("\nBefore sort Array");
		for(int x:a)
			System.out.print(x+" ");
	}
	public static void sortArray(int[] a) {
		int mid=a.length/2;
		for(int i=1;i<=mid;i++) {
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}	
			a[j+1]=key;
		
	}
	
		for(int i=mid+1;i<a.length;i++) {
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
