package String;

public class Reverse_String {
	public static void main(String[] args) {
//		String s1="hi how are you";
//		String rev="";
//		for(int i=0;i<s1.length();i++) {
//			char ch=s1.charAt(i);
//			rev=ch+rev;
//		}
//		System.out.println(rev);
		
		String s1="this is sample test.";
		String rev="";
		for(int i=s1.length()-1;i>=0;i--) {
			char ch=s1.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
	}

}
