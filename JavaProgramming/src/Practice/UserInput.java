package Practice;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the char input");
		char ch=sc.next().charAt(0);
		if(ch>=65 && ch<=90)
			System.out.println("Given char is upper case");
		else if(ch>=97 && ch<=122)
			System.out.println("in lower case");
		else if(ch>=48 && ch<=157)
			System.out.println("in digit char");
		else
			System.out.println("Not a valid alphabet");
	}

}
