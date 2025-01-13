package Array_Programs;

public class FrequencyOfElements {
	/*
	public static void main(String[] args) {
		int[] a= {10,20,20,40,40,21};
		getFrequency(a);
	}
	public static void getFrequency(int[] a) {
		int[] freq=new int[101];
		for(int i=0;i<a.length;i++) {
			freq[a[i]]++;
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>0)
				System.out.println(i+" is: "+freq[i]+" times ");
		}
	}
*/
	public static void main(String[] args) {
		int[] a= {10,20,50,50,20};
		getFrequency(a);
		
	}
	public static void getFrequency(int[] a) {
		int [] freq=new int[101];
		for(int i=0;i<a.length;i++)
			freq[a[i]]++;
		for(int i=0;i<freq.length;i++)
			if(freq[i]>0)
				System.out.println(i+" is occurs "+freq[i]);
	
	}
	
	
	
	
}