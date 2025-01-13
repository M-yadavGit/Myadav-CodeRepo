package Array_Programs;

public class Count_Frequency {
	public static void main(String[] args) {
		int[] a= {10,20,23,23,20,56,60};
		System.out.println("All Elements of an Array: ");
		for(int p:a)
			System.out.print(p+" ");
		getFrequency(a);
	}
	public static void getFrequency(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])
					count++;
			}
		}
	}

}
