package Practice;

public class ReverseWord {

	public static void main(String[] args) {

		String s = "Noida is in UP";
		char[] c = s.toCharArray();
		for (int i=c.length-1; i>=0; i--)
		{
			char rev =  s.charAt(i);	
			System.out.print(rev);
		}		
		
	}

}
