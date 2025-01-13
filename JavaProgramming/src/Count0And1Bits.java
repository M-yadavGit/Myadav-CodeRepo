import java.util.Scanner;
public class Count0And1Bits {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int n=sc.nextInt();
			String result=getBits(n);
			System.out.println(result);
			
		}
	public static String getBits(int n) {
		int count0=0;
		int count1=0;
		while(n>0) {
			if(n%2==0)
				count0++;
			else
			count1++;
		n=n/2;
		}
		return "1's bits are: "+count1+ "\n0's bits are: "+count0;
		
	}
	}

