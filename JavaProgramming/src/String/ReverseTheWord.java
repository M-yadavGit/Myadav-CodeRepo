package String;

import java.util.Scanner;

public class ReverseTheWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.nextLine();
		PrintWordFromEnd(s1);
		sc.close();
	}
	public static void PrintWordFromEnd(String s) {
		String word="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			if(ch!=' ')
				word=ch+word;
			if(ch==' '|| i==0 ) {
			System.out.print(word+" ");
			word="";
			}
			
		}
	}
}
