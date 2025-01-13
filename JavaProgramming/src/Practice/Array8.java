package Practice;

public class Array8 {
	public static void main(String[] args) {
		int []a= {10,10,30,90,45};
		getFreq(a);
	}
	public static void getFreq(int[] a) {
		int n=a.length;
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
			System.out.println(a[i]+" is "+count+" times");
		}
		
	}
//	public static void getFrequency(int[] a) {
//		int n=a.length;
//		for(int i=0;i<n;i++) {
//			int count=1;
//			for(int j=i+1;j<n;j++) {
//				if(a[i]==a[j]) {
//					count++;
//					a[j]=a[n-1];
//					n--;
//					j--;
//				}
//			}
//			System.out.println(a[i]+" is: "+count+" times ");
//		}
		

}
