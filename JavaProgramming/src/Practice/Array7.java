package Practice;

public class Array7 {
	public static void main(String[] args) {
		int [] a= {10,10,30,40,50};
		getFreq(a);
	
	}
	public static void getFreq(int [] a) {
		int [] freq=new int[101];
		for(int i=0;i<a.length;i++) {
			freq[a[i]]++;
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>0)
				System.out.println(i+" is "+freq[i]+" times");
		}
	}
}
