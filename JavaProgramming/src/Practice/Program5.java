package Practice;

public class Program5 {
	public static void main(String[] args) {
		int [] a= {12,20,23,25,90,69};
		System.out.println("Before Sort Array: ");
		for(int x:a)
			System.out.print(x+" ");
		sortArray(a);
		System.out.println("\nAfter Sort Array: ");
		for(int x:a)
			System.out.print(x+" ");
		
	}
	public static void sortArray(int [] a) {
		int n=a.length;
		for(int i=1;i<n;i++) {
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
				n--;
			}
			a[j+1]=key;
			
		}
	}

}
