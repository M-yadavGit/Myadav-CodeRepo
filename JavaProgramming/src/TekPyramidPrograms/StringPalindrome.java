package TekPyramidPrograms;

public class StringPalindrome {
	public static void main(String[] args) {
		String s1="Maam";
		String rev="";
		for(int i=s1.length()-1;i>=0;i--) {
			char ch=s1.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
		if(rev.equalsIgnoreCase(s1))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
	}

}