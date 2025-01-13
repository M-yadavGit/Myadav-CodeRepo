package Array_Assignment;

public class Program19 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		System.out.println("Array Elements");
		for(int x:a)
			System.out.print(x+" ");
		int[] b=leftRotate(a);
		System.out.println("\nleft Rotate Array Elements");
		for(int x:b)
			System.out.print(x+" ");

	}
	public static int[] leftRotate(int[]a) {
		int[] b=new int[a.length];
		int temp=a[0];
		for(int i=0;i<b.length-1;i++) {
			b[i]=a[i+1];	
		}
		b[a.length-1]=temp;
		return b;
	}
}