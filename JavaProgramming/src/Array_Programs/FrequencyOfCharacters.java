package Array_Programs;

public class FrequencyOfCharacters {
	public static void main(String[] args) {
		char[] c= {'a','c','x','q','a','d','a','x'};
		getFrequency(c);
	}
	public static void getFrequency(char[] c) {
		int[] a=new int[26];
		for(int i=0;i<c.length;i++) {
			a[c[i]-97]++;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]>0)
				System.out.println((char)(i+97)+" is: "+a[i]+" times ");
		}
	}

}
