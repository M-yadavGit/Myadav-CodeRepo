package PermutationAndCombination;
import java.util.Scanner;
public class Permutation {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	System.out.println("Enter the number");
	int r=sc.nextInt();
	getPermutation(n,r);
	}
	
	public static void getPermutation(int n, int r) {
		int perm=1;
		for(int i=0;i<r;i++) {
			perm=perm+(n-i);
		}
		System.out.println(perm);
	}
}
