package Array_Programs;
import java.util.Scanner;
public class Linear_Search {
	public static void main(String[] args) {
		int[] a= {10,90,39,45,50};
		System.out.println("An UnSorted Array");
		for(int x:a)
			System.out.print(x+" ");
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the Element you have to find");
		int element=sc.nextInt();
		int indx=searchElement(a,element);
		if(indx>=0)
			System.out.println(element+" is found at index: "+indx);
		else
			System.out.println(element+" is Not found in Array");
		sc.close();
	}

	public static int searchElement(int []a, int element) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==element)
				return i;
		}
		return -1;
	}

}

