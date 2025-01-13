package Array_Programs;

public class BigString_SmallString {
	public static void main(String[] args) {
		String temp;
		String big="";
		//String small;
	String [] a= {"aaaa","a","aaaaa","aa"};
		String small=a[0];
	for(int i=0;i<a.length;i++) {
		temp=a[i];
		if(temp.length()>big.length())
			big=temp;
		if(temp.length()<small.length())
			small=temp;
	}
		System.out.println(big);
		System.out.println(small);
	}

}
