//WAJP to Generate a four digit number by using math class or generate any random number in a given range.
//WAJP to Generate a random number in a range by using Math class?
package PascalTriangle;
import java.util.Scanner;
public class RandomNumbersInRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start range");
		int start=sc.nextInt();
		System.out.println("Enter the end range");
		int end=sc.nextInt();
		int randomnum=start+(int)(Math.random()*(end-start));
		System.out.println("random number is: "+ randomnum);
	}
	
	

}

