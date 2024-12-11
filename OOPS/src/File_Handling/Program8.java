package File_Handling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name");
		String name=sc.nextLine();
		System.out.println("Enter the age");
		int age=sc.nextInt();
		System.out.println("Enter the Weight");
		double weight=sc.nextDouble();
		
		FileWriter fw=null;
	try {
		fw=new FileWriter("c:\\File\\NewUser.txt");
		fw.write("name is: "+name+"\n");
		fw.write("age is: "+age+"\n");
		fw.write("weight is: "+weight+"\n");
	} catch (IOException e) {
		System.out.println("File is not created");
	}
	finally {
		fw.close();
		sc.close();
	}
	}
}
