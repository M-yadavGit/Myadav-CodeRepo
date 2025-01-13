package String;

import java.util.Scanner;

public class CountStringEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		int count=0;
		String word="";
		String word2="";
		int totalcount=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch!=' ')
			{
				word=word+ch;
				count++;
			}
			else
			{
				if(count%2==0)
				{
					totalcount++;
					word2=word2+word+",";
				}
				count=0;
				word="";
			}
			
			if(i==s.length()-1)
			{
				if(count%2==0)
				{
					totalcount++;
					word2=word2+word;
				}
			}
			
		}
		System.out.println("The Even Word is "+word2+" and length is "+totalcount);
	}

}
