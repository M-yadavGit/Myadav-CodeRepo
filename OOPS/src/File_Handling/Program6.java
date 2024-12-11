package File_Handling;
import java.io.*;

public class Program6 {
	public static void main(String[] args) throws IOException {
		FileWriter fw=null;
		try {
			fw=new FileWriter("c:\\File\\p1.txt");
			char[] ch= {'a','a','b','c','d'};
			fw.write(98);
			fw.write(49);
			fw.write(ch);
			fw.write("\nmohan");
			fw.write(ch, 0, 3);
			System.out.println("File is created");
		} catch (IOException e) {
			System.out.println("File is not created: "+e.getMessage());
		}
		finally {
			fw.close();
		}
	}

}
