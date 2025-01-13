package Array_Assignment;

public class Program24 {
	public static void main(String[] args) {
		int[] a= {10,20,20,10,30,100,200,200,123,123,};
		System.out.println("Array element");
		for(int x:a)
			System.out.print(x+" ");
		freqElement(a);
	}
	public static void freqElement(int[] a) {
		int [] b=new int [1001];
		System.out.println("\nFrequency of Array element");
		for(int i=0;i<a.length;i++) {
			b[a[i]]++;
		}
		for(int i=0;i<b.length;i++) {
			if(b[i]>0) {
				System.out.println(i+" is "+b[i]+" times ");
			}
		}
	}

}
