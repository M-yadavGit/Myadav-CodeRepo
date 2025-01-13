package PermutationAndCombination;
	import java.util.Scanner;
	public class Combination {
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Enter the number");
		int r=sc.nextInt();
		getCombination(n,r);
		}
		
		public static void getCombination(int n, int r) {
			int comb=1;
			for(int i=0;i<r;i++) {
				comb=(comb+(n-i))/(i+1);
			}
			System.out.println(comb);
		}
	}

