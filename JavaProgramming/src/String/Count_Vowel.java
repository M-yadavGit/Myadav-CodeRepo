package String;

public class Count_Vowel {
	public static void main(String[] args) {
		String s1="Hi How are you";
		s1=s1.toLowerCase();
		int count=0;
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		}
		System.out.println("total number of Vowel are: "+count);
	}

}
