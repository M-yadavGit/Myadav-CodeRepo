//WAJP to Generate a random number in a range by using random class?
package PascalTriangle;
import java.util.Scanner;
import java.util.Random;
public class GenerateRandomNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r1=new Random();
		System.out.println("Enter the start Number");
		int start=sc.nextInt();
		System.out.println("Enter the end number");
		int end=sc.nextInt();
		int randomnum= start+r1.nextInt(end-start);
		System.out.println("Random number is: "+randomnum);
		
	}

}
