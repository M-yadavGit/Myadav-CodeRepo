package Array_Programs;
import java.util.Scanner;
public class InsertValueAt_Index {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] a= {10,20,22,12,18,15};
		System.out.println("All Elements of an Array: ");
		for(int x:a)
			System.out.print(x+" ");
		System.out.println("\nEnter the index number: ");
		 int index=sc.nextInt();
		 System.out.println("Enter the insert value: ");
		 int value=sc.nextInt();
		 int [] b=insertValue(a,index,value);
		 for(int x:b) {
			 System.out.print(x+" ");
		 }
	}
	public static int[] insertValue(int[] a,int index,int value) {
		int[] b=new int[a.length+1];
		b[index]=value;
		for(int i=0;i<a.length;i++) {
			if(i<index)
				b[i]=a[i];
			else
				b[i+1]=a[i];
		}
		return b;
	}
}
