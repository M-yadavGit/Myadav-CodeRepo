package Array_Programs;
import java.util.Scanner;
public class LeftRotate_k_Times {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a= {10,12,24,34,56,60};
		System.out.println("Before Left Rotate: ");
		for(int p:a)
			System.out.print(p+" ");
		System.out.println("\nEnter the Rotated times Value");
		int k=sc.nextInt();
		LeftRotate(a,k);
		sc.close();
	}
	public static void LeftRotate(int[] a,int k) {
		for(int j=0;j<k;j++) {
		int temp=a[0];
		for(int i=0;i<a.length-1;i++)
			a[i]=a[i+1];
		a[a.length-1]=temp;
		}
		System.out.println("After LeftRotate: ");
		for(int x:a)
			System.out.print(x+" ");
		
	}
}
