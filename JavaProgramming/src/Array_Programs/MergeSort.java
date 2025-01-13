package Array_Programs;

public class MergeSort {
	public static void main(String[] args) {
		int[] a= {10,20,34,90,28,45};
		System.out.println("Before Sorted");
		for(int x:a)
		System.out.print(x+" ");
		System.out.println("\nAfter Sorted");
		mergeSort(a,0,a.length-1);
		for(int x:a)
			System.out.print(x+" ");
	}
	public static void mergeSort(int[] a,int si,int ei) {
		if(ei>si) {
			int mid=si+(ei-si)/2;
			mergeSort(a,si,mid);
			mergeSort(a,mid+1,ei);
			merged(a,si,mid,ei);
		}
	}
	public static void merged(int[]a,int si,int mid,int ei) {
		int[] merged=new int[ei-si+1];
		int index1=si;
		int index2=mid+1;
		int x=0;
		while(index1<=mid && index2<=ei) {
			if(a[index1]<a[index2])
				merged[x++]=a[index1++];
			else
				merged[x++]=a[index2++];
		}
		
		while(index1<=mid)
			merged[x++]=a[index1++];
		while(index2<=ei)
			merged[x++]=a[index2++];
		for(int i=0,j=si;i<merged.length;i++,j++) {
			a[j]=merged[i];
		}
		
	}
}
