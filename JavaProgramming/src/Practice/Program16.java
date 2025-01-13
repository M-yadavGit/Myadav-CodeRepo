package Practice;

import java.util.Scanner;

public class Program16 {
	public static void main(String[] args) {
		int[] a= {10,20,30,50};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index value");
		int index=sc.nextInt();
		System.out.println("Enter the index value");
		int value=sc.nextInt();
		int [] x=insertElement(a,index,value);
		for(int p:x)
			System.out.print(p+" ");
	}
	public static int[] insertElement(int[] a,int index,int value) {
		int [] b=new int[a.length+1];
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
