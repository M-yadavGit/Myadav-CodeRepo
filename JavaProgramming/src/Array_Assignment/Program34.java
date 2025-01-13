package Array_Assignment;

public class Program34 {
	public static void main(String[] args) {
		//int[] a= {10,20,30,40,40};
		int[] a= {10,20,30,40,40,20,11,10,30,40,30,1,3,-4,67,67,-4};
		System.out.println("All Array's element");
		for(int x:a)
			System.out.print(x+" ");
		System.out.println();
		System.out.println(storeUniqRemoveDuplicates(a));
			
	}
	
	public static boolean storeUniqRemoveDuplicates(int[] a) {
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j])
					return false;
			}
		}
		return true;
		}
		
	}
