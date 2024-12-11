package File_Handling;
import java.io.*;
public class Program1 {
	public static void main(String[] args) throws IOException {
		FileWriter fw=null;
		try {
			 fw=new FileWriter("c:\\File\\java.text");
			 String s1="abc";
			 fw.write(48);
			 fw.write(s1);
			 System.out.println("File created and write");
		} catch (IOException e) {
			System.out.println("File is not created: "+e.getMessage());
		}
		finally {
			fw.close();
		}
		
	}

}
