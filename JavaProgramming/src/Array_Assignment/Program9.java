package Array_Assignment;

public class Program9 {
	public static void main(String[] args) {
		String [] a= {"a","ab","abcd","pqr","pqrs","xyzxyzpq"};
		String big="";
		String small= a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>big.length())
				big=a[i];
			if(a[i].length()<small.length())
				small=a[i];	
		}
		System.out.println("Biggest String is: "+big);
		System.out.println("Smallest String is: "+small);
	}
}
