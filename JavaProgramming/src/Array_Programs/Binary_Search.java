package Array_Programs;
import java.util.Scanner;
public class Binary_Search {
	public static void main(String[] args) {
		int[] a= {10,20,39,45,50};
		System.out.println("A Sorted Array");
		for(int x:a)
			System.out.print(x+" ");
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the Element you have to find");
		int element=sc.nextInt();
		int indx=searchElement(a,element,0,a.length-1);
		if(indx>=0)
			System.out.println(element+" is found at index: "+indx);
		else
			System.out.println(element+" is Not found in Array");
		sc.close();
	}

	public static int searchElement(int []a,int element,int si,int ei) {
		int mid=si+(ei-si)/2;
		if(a[mid]==element)
			return mid;
		else if(si>ei)
			return -1;
		else if(a[mid]>element)
			return searchElement(a,element,si,mid-1);
		else
			return searchElement(a,element,mid+1,ei);
	}

}

