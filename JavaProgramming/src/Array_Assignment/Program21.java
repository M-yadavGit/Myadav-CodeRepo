package Array_Assignment;

public class Program21 {
	public static void main(String[] args) {
		//int[] a= {7,0,2,6,0,4};
		int[] a= {1,0,0,0,0,10,0,0,0,5,0,7,5,100,300,9,0,0};
		System.out.println("Elements of the Array");
		for(int x:a)
			System.out.print(x+" ");
		int[] b=moveZeros(a);
		System.out.println("\nUpdated Elements of the Array");
		for(int x:b)
			System.out.print(x+" ");
	}
	public static int[] moveZeros(int [] a) {
		int n=a.length;
		int x=0;
		int [] b=new int[n];
		for (int i = 0; i < n; i++) {
			if(a[i]!=0) {
				b[x++]=a[i];
			}
		}
		for(int i=0;i<n;i++) {
			if(a[i]==0)
				b[x++]=a[i];
		}
		return b;
	}

}
