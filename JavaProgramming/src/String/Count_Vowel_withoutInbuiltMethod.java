package String;

public class Count_Vowel_withoutInbuiltMethod {
	public static void main(String[] args) {
			String s1="Hi How are you";
			int count=0;
			for(int i=0;i<s1.length();i++) {
				char ch=s1.charAt(i);
				if(ch>='A' && ch<='Z')
					ch=(char)(ch+32);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					count++;
				}
			}
			System.out.println("total number of Vowel are: "+count);
		}

	}
