package String;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the the String: ");
		String s = sc.nextLine();
		reverse(s);
	}
	public static void reverse(String s) {
		String word="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			if(ch!=' ')
				word=ch+word;
			else {
				System.out.print(word+" ");
				word="";
			}
			if(i==0) {
				System.out.print(word);
			}
		}
		
	}
}
