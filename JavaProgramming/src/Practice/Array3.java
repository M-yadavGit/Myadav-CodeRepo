package Practice;

public class Array3 {
	public static void main(String[] args) {
		String[] a= {"ab","abc","abcd","a","asdfghj"};
		String small=a[0];
		String large="";
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>large.length())
				large=a[i];
			if(a[i].length()<small.length())
				small=a[i];
		}
		System.out.println(large);
		System.out.println(small);
		
	}

}
