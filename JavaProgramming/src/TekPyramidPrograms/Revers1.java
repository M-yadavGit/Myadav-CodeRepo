package TekPyramidPrograms;

public class Revers1 {
	public static void main(String[] args) {
		String s1="Hello Java this is my interview question";//olleh avaj
		revWord(s1);
	}
	public static void revWord(String s1) {
		String word="";
		for(int i=s1.length()-1;i>=0;i--) {
			char ch=s1.charAt(i);
			if(ch!=' ')
				word=ch+word;
			if(ch==' ' || i==0) {
				System.out.print(word+" ");
				word="";
			}
		}
	}
}
