package Practice;

public class Array2 {
	public static void main(String[] args) {
		String[] s= {"ab"+"abc"+"abcd"+"a"+"asdfghj"};
		for(int i=0;i<s.length;i++) {
			if(s[i].length()%2==0)
			{
				System.out.println(s[i]);
			}
		}
		
	}

}
