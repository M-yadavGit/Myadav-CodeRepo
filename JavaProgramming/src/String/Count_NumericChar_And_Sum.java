package String;

public class Count_NumericChar_And_Sum {
	public static void main(String[] args) {
		String s1="mo097bg35vw1";
		int count=0;
		int sum=0;
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch>=48 && ch<=57) {
				count++;
			sum=sum+(ch-48);
			}
		}
		System.out.println("Total number of numeric character are: "+count);
		System.out.println("Sum of that numeric character are"+sum);
	}

}
