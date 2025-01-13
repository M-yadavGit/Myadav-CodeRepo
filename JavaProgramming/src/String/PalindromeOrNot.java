package String;

public class PalindromeOrNot {
	public static void main(String[] args) {
		String s1="Maaam";
		String rev="";
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			rev=rev+ch;
		}
		if(rev.equalsIgnoreCase(s1))
			System.out.println(true);
		else
			System.out.println(false);
	}

}
