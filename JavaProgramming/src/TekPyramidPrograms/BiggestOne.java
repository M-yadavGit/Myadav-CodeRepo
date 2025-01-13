package TekPyramidPrograms;

public class BiggestOne {
	public static void main(String[] args) {
	int[] a= {10,20,30,40,228};
	biggestOne(a);
	}
	public static void biggestOne(int []a) {
		int big1=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>big1)
				big1=a[i];
		}
		System.out.println(big1);
	}

}
