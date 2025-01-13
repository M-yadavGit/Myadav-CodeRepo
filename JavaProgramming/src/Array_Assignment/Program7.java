package Array_Assignment;

public class Program7 {
	public static void main(String[] args) {
		int big=Integer.MIN_VALUE;
		int small=Integer.MAX_VALUE;
		int [] a= {27,90,36,59,55,35,49,30};
		for(int i=0;i<a.length;i++) {
			if(a[i]>big)
				big=a[i];
			if(a[i]<small)
				small=a[i];
		}
		System.out.println("Smallest element is : "+small);
		System.out.println("Biggest element is : "+big);
		System.out.println("Diffrence B/W Smallest and Biggest elements is: "+(big-small));
	}
}
