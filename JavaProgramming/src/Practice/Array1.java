package Practice;

public class Array1 {
	public static void main(String[] args) {
		int [] a= {10,23,325,400,500};
		int big=Integer.MIN_VALUE;
		int small=Integer.MAX_VALUE;
		for(int x:a) {
			if(x>big)
				big=x;
			if(x<small)
				small=x;
		}
		int diff=big-small;
		System.out.println(diff);
		
	}

}
