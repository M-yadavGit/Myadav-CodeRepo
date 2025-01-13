package Practice;

public class Program15 {
	public static void main(String[] args) {
		String [] a= {"bc","aab","aaaa","abababa"};
		String big="";
		String small=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>big.length())
				big=a[i];
			else if(a[i].length()<small.length())
				small=a[i];
		}
		System.out.println(big+" "+small);
	}

}
