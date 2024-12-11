package File_Handling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("c:abcd.txt");
		byte[] b1= {'a','b','s'};
		fos.write(97);
		fos.write(b1);
		fos.write("mohan".getBytes());
	}

}
