package Array_Assignment;

public class Program35 {
	public static void main(String[] args) {
		//int[] a= {10,20,33,29,37,48,60};
		int[] a= {10,20,30,40,40,20,11,10,30,40,30,1,3,-4,67,67,-4};
		System.out.println("Array Elements");
		for(int x:a)
			System.out.print(x+" ");
		biggestAndSecondbiggest(a);
		
	}
	public static void biggestAndSecondbiggest(int[] a) {
		int big1=Integer.MIN_VALUE;
		int big2=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>big1) {
				big2=big1;
				big1=a[i];
			}
			else if(a[i]>big2 && a[i]!=big1) {
				big2=a[i];
			}
		}
		System.out.println();
		System.out.println("Biggest elements is: "+big1);
		System.out.println("Second Biggest is: "+big2);
	}

}
