package Array_Programs;
public class BiggestAndSmallestOfArray {
	
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		int big=Integer.MIN_VALUE;
		int small=Integer.MAX_VALUE;
		int temp;
		for(int x:a) {
		 temp=x;
		if(temp>big)
			big=temp;
		if(temp<small)
			small=temp;
		}
			System.out.println(big);
			System.out.println(small);
}
}
