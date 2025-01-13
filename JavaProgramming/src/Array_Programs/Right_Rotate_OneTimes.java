package Array_Programs;
public class Right_Rotate_OneTimes {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,33,12,24};
		System.out.println("Before Right Rotate Array");
		for(int p:a)
			System.out.print(p+" ");
		rightRotate(a);
		
	}
	public static void rightRotate(int [] a) {
		int temp=a[a.length-1];
		for(int i=a.length-1;i>0;i--)
			a[i]=a[i-1];
		a[0]=temp;
		System.out.println("\nAfter Right Rotate Array");
		for(int x:a)
			System.out.print(x+" ");
	}

}
