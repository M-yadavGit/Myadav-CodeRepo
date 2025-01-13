package Practice;

public class BigSmallArrayElement {
	public static void main(String[] args) {
		int [] a= {100,230,300,400};
		int big=Integer.MIN_VALUE;
		int small=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>big)
				big=a[i];
			else if(a[i]<small && a[i]!=big)
				small=a[i];
		}
			System.out.println(big);
		if(!(small==Integer.MAX_VALUE))
			System.out.println(small);
		else
			System.out.println("Small is not exist");
	}

}
