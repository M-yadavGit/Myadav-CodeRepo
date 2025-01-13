package Practice;

public class Program12 {
	public static void main(String[] args) {
		int [] a= {10,30,30,5,100};
		int big=Integer.MIN_VALUE;
		int small=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>big)
				big=a[i];
			else if(a[i]<small)// && a[i]!=big)
				small=a[i];
		}
		System.out.println(big+" "+small);
	}

}