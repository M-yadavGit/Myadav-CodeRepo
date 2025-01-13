package TekPyramidPrograms;

public class ReverseWorld {
	public static void main(String[] args) {
		String s1 = "Hello Java";
		revWord(s1);
	}

	public static void revWord(String s) {
		String word = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			if (ch != ' ')
				word = ch + word;
			if(ch==' '|| i==0){
				System.out.print(word + " ");
				word = "";
			}
		}

	}

}
