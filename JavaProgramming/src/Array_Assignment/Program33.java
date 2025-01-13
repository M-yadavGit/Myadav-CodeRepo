package Array_Assignment;

public class Program33 {
	public static void main(String[] args) {
		//int[] a= {10,20,20,-1,30,-1,20,20,12,12,12,-1,32,-3,11,20,10,12,30 };
		int[] a= {10,20,30,40,40,20,11,10,30,40,30,1,3,-4,67,67,-4};
		System.out.println("All Array's element");
		for(int x:a)
			System.out.print(x+" ");
		
		System.out.println("\nUnique Array element");
		int [] b=storeUniqRemoveDuplicates(a);
		
		System.out.println("\nNew Array element");	
		for(int x:b)
			System.out.print(x+" ");
	}
	public static int[] storeUniqRemoveDuplicates(int[] a) {
		int n=a.length;
		int [] b=new int[a.length];
	
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					a[j]=a[n-1];
					n--;
					j--;
				}
			}
			System.out.print(a[i]+" ");
			b[i]=a[i];
		}
		
		return b;
		}
		
	}
