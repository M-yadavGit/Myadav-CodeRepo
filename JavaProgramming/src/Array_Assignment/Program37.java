package Array_Assignment;

public class Program37 {
	public static void main(String[] args) {
		int[] a= {1,3,7,9,4,6};
		System.out.println("Array Elements");
		for(int x:a)
			System.out.print(x+" ");
		maxProduct(a);
		
	}
	public static void maxProduct(int[] a) {
		int n=a.length;
		int maxPro=0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				int p=a[i]*a[j];
				if(p>maxPro)
					maxPro=p;
			}
		}
		System.out.println();
		System.out.println("max product of two Integer is: "+maxPro);
	}
}
