package Array_Programs;
import java.util.Scanner;
public class UserInput_ArrayElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		int [] a=new int[size];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the element: "+(i+1));
			a[i]=sc.nextInt();
			//System.out.println(a[i]);
		}
		for(int i:a)
			System.out.println(i);
	}

}
