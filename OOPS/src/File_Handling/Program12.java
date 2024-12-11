package File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program12 {
	public static void main(String[] args) {
		File f1=new File("c:\\File\\Program1.java");
		Scanner sc=null;
		try {
		 sc=new Scanner(f1);
		 while(sc.hasNextLine()) {
			 System.out.println(sc.nextLine());
			 
		 }
		} catch (FileNotFoundException e) {
			System.out.println("File is not created");
		}
		
	}

}
