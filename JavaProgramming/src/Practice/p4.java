package Practice;

public class p4 {
	public static void main(String[] args) {
		char[] a= {'a','b','a','b','a','v'};
		getFrequency(a);
	}
	public static void getFrequency(char [] a) {
		int[] fre=new int[100];
		for(int i=0;i<a.length;i++)
			fre[a[i]-97]++;
		for(int i=0;i<fre.length;i++){
			if(fre[i]>0)
				System.out.println((char)(i+97)+" is "+fre[i]+" times ");
		}
	}

}
