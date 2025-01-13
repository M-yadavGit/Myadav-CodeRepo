package Practice;

public class CountBit
	{
		public static void main(String[] args)
		{
			int n=100;
			getBitsCount(n);
		}
		public static void getBitsCount(int n){
			int count=0;
			while(n>0){
				count++;
			n=n/2;
			}
			System.out.println("Total Bits are: "+count);
		}	
	}

