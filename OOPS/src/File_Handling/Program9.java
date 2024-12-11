package File_Handling;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Program9 {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("c:\\File\\p8.txt");
			byte[] b1= {'M','i','t','h','l','e','s','h'};
			byte[] b2= {1,2,3,4};
			fos.write(23);
			fos.write(b2);
			fos.write(b1);
			fos.write(b1, 0, 5);
		} catch (FileNotFoundException e) {
			System.out.println("File is not created "+e.getMessage());
		}
		finally {
			fos.close();
			
		}
	}

}
