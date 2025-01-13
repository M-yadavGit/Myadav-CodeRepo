//Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
import java.util.Scanner;
public class LeetCode338 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		LeetCode338 lc=new LeetCode338();
		int [] result=lc.countBits(n);
		for (int i = 0; i <= n; i++) {
            System.out.println(i + ": " + result[i]);
        }
		
}
	public int[] countBits(int n) {
	int[] arr= new int[n+1];
	for(int i=0; i<=n; i++) {
		int p=i;
		int count=0;
		while(p>0) {
			if(p%2==1)
				count++;
		p=p/2;
		}
	arr[i]=count;
	}
	return arr;	
}
}