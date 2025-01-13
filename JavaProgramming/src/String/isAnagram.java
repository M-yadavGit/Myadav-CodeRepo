package String;

import java.util.Scanner;

public class isAnagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.nextLine();
		System.out.println("Enter the string");
		String s2=sc.nextLine();
		System.out.println(isAnagram(s1,s2));
		sc.close();
	}
	public static boolean isAnagram(String s,String t) {
		int[] freq1=getFreqArray(s);
		int[] freq2=getFreqArray(t);
		for(int i=0;i<freq1.length;i++) {
			if(freq1[i]!=freq2[i])
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
