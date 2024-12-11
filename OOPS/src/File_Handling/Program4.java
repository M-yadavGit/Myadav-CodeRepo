package File_Handling;

import java.io.FileReader;
import java.io.IOException;

public class Program4 {
	public static void main(String[] args) throws IOException {
		
	FileReader fr=new FileReader("c:\\p\\Car.java");
	int x=fr.read();
	while(x!=-1) {
		System.out.print((char)x);
		x=fr.read();
	}
	}

}
