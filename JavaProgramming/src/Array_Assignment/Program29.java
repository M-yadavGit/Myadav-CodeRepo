package Array_Assignment;

public class Program29 {
	public static void main(String[] args) {
		int[] a= {10,20,20,10,30,10,20,20,12,12,12,-1,32,-3,11,20,10,12,30 };
		System.out.println("Array element");
		for(int x:a)
			System.out.print(x+" ");
		System.out.println("\nFrequency of the Array element");
		duplicatesElements(a);
	}
	public static void duplicatesElements(int[] a) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					count++;
				a[j]=a[n-1];
				j--;
				n--;
				}	
			}
			if(count>1)
			System.out.println(a[i]+" is "+count+" times ");
		}
	}

}
