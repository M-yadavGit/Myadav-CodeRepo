package Practice;

public class MergeSort {
	public static void main(String[] args) {
		int[] a= {10,90,29,38,28};
		System.out.println("Before Sort");
		for(int x:a)
			System.out.print(x+" ");
		sortArray(a,0,a.length-1);
		System.out.println("\nAfter Sort");
		for(int x:a)
			System.out.print(x+" ");
	}
	public static void sortArray(int[] a,int si,int ei) {
		if(ei>si) {
		int mid=si+(ei-si)/2;
		sortArray(a,si,mid);
		sortArray(a,mid+1,ei);
		mergedArray(a,si,mid,ei);
	}
	}
	public static void mergedArray(int[]a,int si,int mid,int ei) {
		int [] b=new int[ei-si+1];
		int index1=si;
		int index2=mid+1;
		int x=0;
		while(index1<=mid && index2<=ei) {
			if(a[index1]<a[index2])
				b[x++]=a[index1++];
			else
				b[x++]=a[index2++];
		}
		while(index1<=mid)
			b[x++]=a[index1++];
		while(index2<=ei)
			b[x++]=a[index2++];
		for(int i=0,j=si;i<b.length;i++,j++)
			a[j]=b[i];
	}
	
}
