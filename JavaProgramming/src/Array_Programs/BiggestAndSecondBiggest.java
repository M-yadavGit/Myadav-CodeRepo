package Array_Programs;

public class BiggestAndSecondBiggest {
	public static void main(String[] args) {
		int[] a= {10,20,56,90,120,34,89,45};
		getBiggest(a);
				
	}
	public static void getBiggest(int[] a) {
		int h1=Integer.MIN_VALUE;
		int h2=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>h1) {
				h2=h1;
				h1=a[i];
			}else if(a[i]>h2 && a[i]!=h1) 
				h2=a[i];
			
		}
		System.out.println("Biggest number is "+h1);
		if(!(h2==Integer.MIN_VALUE))
			System.out.println("Second biggest is: "+h2);
		else
			System.out.println("Second biggest is not exists");
	}
}
