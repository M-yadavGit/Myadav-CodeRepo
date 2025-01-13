package TekPyramidPrograms;

public class SecondBiggest {
	public static void main(String[] args) {
		int[] a= {10,10,10,10,10,10,10};
		getBiggest(a);
	}
	public static void getBiggest(int[] a) {
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
		if(big2!=Integer.MIN_VALUE)
		System.out.println(big2);
		else System.out.println("big2 not exist All the number are same");
	}

}
