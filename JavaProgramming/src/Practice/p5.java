package Practice;

import java.util.Scanner;

public class p5 {
	public static void main(String[] args) {
		int[] a= {10,20,10,40,60};
		
		getFre(a);

	}
	public static void getFre(int [] a) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					count++;
				a[j]=a[a.length-1];
				n--;
				j--;
				}
			}
			System.out.println(a[i]+" is "+count+" times ");
			
				
		}
	}

}
