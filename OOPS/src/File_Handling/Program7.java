package File_Handling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program7 {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		FileWriter fw=null;
		try {
			fw=new FileWriter("c:\\File\\UserinputString.txt");
			fw.write(s1);
		} catch (IOException e) {
			System.out.println("File is not created");
		}
		finally {
			sc.close();
			fw.close();
			
		}
		
	}

}
