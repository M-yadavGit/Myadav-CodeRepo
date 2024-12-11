package File_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program10 {
	public static void main(String[] args) throws IOException {
		FileReader fr=null;
		try {
			fr=new FileReader("c:\\File\\Program1.java");
			int x = fr.read();
			while(x!=-1) {
				System.out.print((char)x);
				x=fr.read();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File is not created: "+e.getMessage());
		}
	}

}
