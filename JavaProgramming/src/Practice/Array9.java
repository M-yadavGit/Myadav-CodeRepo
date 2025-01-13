package Practice;

public class Array9 {
	public static void main(String[] args) {
		int[] a= {10,33,49,56,38,56,48};
		int big=Integer.MIN_VALUE;
		int small=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>big)
				big=a[i];
			if(a[i]<small)
				small=a[i];
		}
		System.out.println(big);
		System.out.println(small);
		System.out.println(big-small);
		
	}

}
