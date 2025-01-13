package Practice;

import java.util.Scanner;

public class Array5 {
		public static void main(String[] args) {
			//int[] a= {10,10,10,10,10,10,10};
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of array: ");
			int size=sc.nextInt();
			int [] a=new int[size];
			for(int i=0;i<a.length;i++) {
				System.out.println("Eneter the Element: "+(i+1));
				a[i]=sc.nextInt();
			}
			int big1=Integer.MIN_VALUE;
			int big2=Integer.MIN_VALUE;
			for(int i=0;i<a.length;i++) {
				if(a[i]>big1) {
					big2=big1;
					big1=a[i];
				}
				else if(a[i]>big2 && a[i]!=big1)
					big2=a[i];	
			}
			System.out.println(big1);
			if(!(big2==Integer.MIN_VALUE))
				System.out.println(big2);
			else
				System.out.println("Big2 is not exist");

	}


}
