package Practice;

public class Biggest {
	public static void main(String[] args) {
		int[] a= {10,20,10,23,45,65,34};
		getBiggest(a);
	
	}
	public static void getBiggest(int[] a) {
		int h1=Integer.MIN_VALUE;
		int h2=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>h1) {
				h1=h2;
				h1=a[i];
			}else if(a[i]>h2 && a[i]!=h1)
				h2=a[i];
		}
		System.out.println(h1);
		System.out.println(h2);
	}

}
