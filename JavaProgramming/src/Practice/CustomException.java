package Practice;

import java.io.IOException;

public class CustomException extends Exception{
	public static void main(String[] args) {
		
		try {
			customException();
		}
		catch(IOException e) {
			
		}
		
	
}
	public static void customException() throws IOException {
		{
			throw new IOException();
		}
	}

}
