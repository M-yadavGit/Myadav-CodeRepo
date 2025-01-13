package Array_Assignment;

public class Program17 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		System.out.println("Array Elements");
		for(int x:a)
			System.out.print(x+" ");
		int[] b=rightRotate(a);
		System.out.println("\nRight Rotate Array Elements");
		for(int x:b)
			System.out.print(x+" ");

	}
	public static int[] rightRotate(int[]a) {
		int[] b=new int[a.length];
		int temp=a[a.length-1];
		for(int i=0;i<b.length-1;i++) {
			b[i+1]=a[i];	
		}
		b[0]=temp;
		return b;
	}
}