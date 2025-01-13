package Array_Programs;

public class SmallestAndSecondSmallest {
	public static void main(String[] args) {
		int [] a= {10,10,10,10};
		getSmallest(a);
	}
	public static void getSmallest(int[] a) {
		int h1=Integer.MAX_VALUE;
		int h2=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<h1) {
				h2=h1;
				h1=a[i];
			}
			else if(a[i]<h2 && a[i]!=h1)
				h2=a[i];
		}
		System.out.println(h1);
		if(!(h2==Integer.MAX_VALUE))
				System.out.println(h2);
		else
		System.out.println("Second Smallest does not exist");
	}

}
