package Array_Programs;
import java.util.Scanner;
public class ToPrint_Even_index_Element {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		int [] a=new int[size];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the element: "+(i));
			a[i]=sc.nextInt();
			
			if(i%2==0)
				System.out.println("Even index elements of an array: "+a[i]);
			
		}
		for(int p:a) {
			if(p%2==0)
				System.out.println("Even Element of an array: "+p);
		}
	
	}

}
