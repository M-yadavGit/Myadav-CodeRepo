package File_Handling;

import java.io.File;
import java.io.IOException;

public class Program5 {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		File f1=new File("c:\\File\\javaFile.txt");
		try {
			f1.createNewFile();
			System.out.println("File is created");
		} catch (Exception e) 																																																																																											{
			System.out.println("File is not created: "+e.getMessage());
		}
		System.out.println("Program Ends!");
	}

}
