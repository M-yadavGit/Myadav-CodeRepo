package Practice;

import java.util.Scanner;

public class Program18 {
		public static void main(String[] args) {
			int[] a= {10,20,30,50};
			Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			rightRotate(a,x);
			for(int p:a)
				System.out.print(p+" ");
	}
		public static void rightRotate(int [] a,int k) {
			for(int j=1;j<=k;j++) {
				
			int temp=a[a.length-1];
			for(int i=a.length-1;i>0;i--) {
				a[i]=a[i-1];
			}
			a[0]=temp;
			
		}
		}

}
