package Practice;

public class UniqueElements {
	public static void main(String[] args) {
		int[] a= {10,10,20,10,33,22,67,21,33};
		getUniqueElements(a);
		
	}
	public static void getUniqueElements(int[] a) {
		int max=0;
		int[] b=new int[101];
		for(int i=0;i<a.length;i++) {
			b[a[i]]++;
		}
		for(int i=0;i<b.length;i++) {
			if(b[i]>0) {
				if(b[i]>max)
					max=b[i];
				//System.out.println(i+" is"+b[i]+" times");
		}
			
		}
		System.out.println(max);
		
	}
}
