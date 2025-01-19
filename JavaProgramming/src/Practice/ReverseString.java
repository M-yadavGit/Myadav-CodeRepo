package Practice;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Mohan Is A Good Boy";
		String rev= "";
		for(int i=s.length()-1; i>=0; i--)
		{			
			char ch = s.charAt(i);
			rev = rev + ch;						
		}
		System.out.println(rev);
	
	}

}
