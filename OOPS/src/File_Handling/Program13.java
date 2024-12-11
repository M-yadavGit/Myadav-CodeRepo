package File_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Program13 {
	public static void main(String[] args) throws IOException {
		FileInputStream f1=null;
		int count=0;
		try {
			f1=new FileInputStream("c:\\File\\Program1.java");
			int x = f1.read();
			while(x!=-1) {
				if(x>=48 &&x<=57) {
				count++;
				System.out.print((char)x);
				}
				x=f1.read();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File is not created");
		}
		System.out.println("\nNumber of Numeric Character: "+count);
	}

}
