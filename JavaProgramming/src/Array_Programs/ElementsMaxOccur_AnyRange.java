package Array_Programs;

public class ElementsMaxOccur_AnyRange {
	public static void main(String[] args) {
		int[] a= {10,20,10,20,10,30,10,10};
		getFrequency(a);
	}
	public static void getFrequency(int[] a) {
		int n=a.length;
		int maxCount=Integer.MIN_VALUE;
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
			if(count>maxCount)
				maxCount=count;
			System.out.println(a[i]+" is: "+count+" times ");
			
		}
		System.out.println(maxCount);
	}

}
