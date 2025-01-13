package Practice;

import java.util.Iterator;

public class UniqueUsingAnyRange {
	public static void main(String[] args) {
	int[] a= {10,-1,20,-3,22,22,10,-1,-3};
	getUnique(a);
}
	public static void getUnique(int[] a) {
		int n=a.length;
		int max=0;
		for(int i=0;i<n;i++) {
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]=a[n-1];
					n--;
					j--;
				}
			}
			if(count>max)
				max=count;
			//System.out.println(max);
			//System.out.println(a[i]+" is "+count+" times ");
		}
		System.out.println(max);
}
}
