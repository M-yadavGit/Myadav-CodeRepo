package TekPyramidPrograms;

public class BiggestFirst {
	public static void main(String[] args) {
		int [] a= {10,20,40,60,37,56};
		getBigest(a);
		
	}
	public static void getBigest(int[] a) {
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
		System.out.println(big1);
		System.out.println(big2);
		
	}

}
