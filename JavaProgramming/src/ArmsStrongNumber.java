import java.util.Scanner;
public class ArmsStrongNumber {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        if(isArmstrong(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	        
	        scanner.close();
	    }
	    
	    // Function to check if a number is an Armstrong number
	    public static boolean isArmstrong(int number) {
	    	
	        int originalNumber, remainder, result = 0, n = 0;
	        originalNumber = number;
	        
	        // Count number of digits
	        for (; originalNumber != 0; originalNumber /= 10, ++n);
	        
	        originalNumber = number;
	        
	        // Calculate result
	        for (; originalNumber != 0; originalNumber /= 10) {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, n);
	        }
	        
	        // Check if number is Armstrong
	        if (result == number) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	}

