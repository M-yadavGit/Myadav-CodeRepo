package Array_Assignment;

public class Program36 {
	public static void main(String[] args) {
		//int[] a= {10,20,33,29,37,48,60};
		int[] a= {10,20,30,40,40,20,11,10,30,40,30,1,3,-4,67,67,-4};
		System.out.println("Array Elements");
		for(int x:a)
			System.out.print(x+" ");
		smallestAndSecondSmallest(a);
		
	}
	public static void smallestAndSecondSmallest(int[] a) {
		int small1=Integer.MAX_VALUE;
		int small2=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<small1) {
				small2=small1;
				small1=a[i];
			}
			else if(a[i]<small2 && a[i]!=small1) {
				small2=a[i];
			}
		}
		System.out.println();
		System.out.println("smallest elements is: "+small1);
		System.out.println("second smallest is: "+small2);
	}

}
