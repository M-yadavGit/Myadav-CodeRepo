package File_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Program11 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("c:\\File\\Program1.java");
			int x = fis.read();
			while(x!=-1) {
				System.out.print((char)x);
				x=fis.read();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File is not created");
		}
		finally {
			fis.close();
		}
	}

}
