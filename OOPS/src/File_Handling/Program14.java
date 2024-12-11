package File_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Program14 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=null;
		int sum=0;
		int count=0;
		try {
			fis=new FileInputStream("c:\\File\\Program1.java");
			int x = fis.read();
			while(x!=-1) {
				if(x>=48 && x<=57) {
					count++;
				sum=sum+(x-48);
				System.out.print((char)x);
				}
				x=fis.read();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File is not create");
		}
		System.out.println("\nsum of numeric characters are: "+sum);
		System.out.println("number of numeric characters are: "+count);
	}

}
