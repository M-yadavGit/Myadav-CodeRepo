package TekPyramidPrograms;

public class CountVowels {
	public static void main(String[] args) {
//		String s1 = "this is sample test";
//		String s2 = s1.toLowerCase();
//
//		char[] s3 = s2.toCharArray();
//		int count = 0;
//		for (int i = 0; i < s1.length(); i++) {
//			if (s3[i] == 'a' || s3[i] == 'e' || s3[i] == 'i' || s3[i] == 'o' || s3[i] == 'u') {
//				count++;
//				System.out.print(s3[i] + " ");
//			}
//		}
//		System.out.println("\ntotal vowel " + count);
		String s1="Welcome to Infosys";
		String s2=s1.toLowerCase();
		char [] s3=s2.toCharArray();
		int count=0;
		for(int i=0;i<s3.length;i++) {
			if(s3[i]=='a' || s3[i]=='e' ||s3[i]=='i' || s3[i]=='o' || s3[i]=='i' || s3[i]=='u') {
				count++;
			System.out.print(s3[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Total Vowel count is: "+count);
	}

}
