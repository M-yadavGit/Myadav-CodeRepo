package Practice;

public class Program19 {
	public static void main(String[] args) {
		int [] a= {10,20,10,30,10,10};
		int[] freq=new int[a.length];
		for(int i=0;i<a.length;i++) {
			freq[a[i]]++;
		}
		for(int i=0;i<freq.length;i++)
			if(freq[i]>0)
				System.out.println(i+"is"+freq+"times");
		
		
	}

}
