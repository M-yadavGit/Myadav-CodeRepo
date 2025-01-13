package Array_Programs;

public class LeftRotate_OneTimes {
	public static void main(String[] args) {
		int[] a= {10,11,12,14,35,50};
		System.out.println("Before LeftRotate: ");
		for(int p:a)
			System.out.print(p+" ");
		leftRotate(a);
	}
	public static void leftRotate(int[] a) {
		int temp=a[0];
		for(int i=0;i<a.length-1;i++)
			a[i]=a[i+1];
		a[a.length-1]=temp;
		System.out.println("\nAfter LeftRoate: ");
		for(int x:a)
			System.out.print(x+" ");
	}
}
