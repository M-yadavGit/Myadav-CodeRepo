package String;

public class Count_numbers_Word {
	public static void main(String[] args) {
		String s1="hi how are you";
		int count=0;
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(i==0 && ch!=' '|| s1.charAt(i-1)==' ' && ch!=' ') {
				count++;
			}
		}
		System.out.println("Total numbers of words are: "+count);
		
	}

}
