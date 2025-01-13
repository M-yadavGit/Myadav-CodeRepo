package Practice;

public class Bubble_Sort2 {
	public static void main(String[] args) {
		int [] a= {200,39,22,48,300,298};
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
		for(int i=0;i<n-1;i++) {
			int x=0;
			for(int j=0;j<n-1;j++) {
				if(a[j]>a[j+1]){
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				x++;
			}
		}
			if(x==0)
				return;
		
	}
	}
}
