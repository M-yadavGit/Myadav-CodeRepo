package Array_Assignment;

public class Program43 {
	public static void main(String[] args) {
		int [] a= {7,4,3,5,1,6};
		System.out.println("Array a is: ");
		for(int x:a)
			System.out.print(x+" ");
		System.out.println();
		missingElement(a);
	}
	public static void missingElement(int[] a) {
		int n=a.length;
		int [] b=new int[a.length+2];
		for(int i=0;i<n;i++) {
			b[a[i]]++;
		}
		
		for(int i=1;i<b.length;i++) {
				if(b[i]==0)
					System.out.print(i+" ");
			}
			
	}
}
