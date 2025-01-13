package String;

import java.util.Scanner;

public class isPanagram {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string");
			String s1=sc.nextLine();
			System.out.println(isPanagram(s1));
		}
	public static boolean isPanagram(String s) {
		int [] freq=getFreqArray(s);
		for(int i=0;i<freq.length;i++) {
			if(freq[i]==0)
				return false;
		}
		return true;
		
	}
	
	public static int[] getFreqArray(String s) {
		int[] freq=new int[26];
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>=65&& ch<=90)
				freq[ch-65]++;
			else if(ch>=97 && ch<=122)
				freq[ch-97]++;
		}
		return freq;
	}

}
