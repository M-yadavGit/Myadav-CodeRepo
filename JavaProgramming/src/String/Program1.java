package String;

public class Program1 {
	public static void main(String[] args) {
		String s1="a4b34cd45e";
		sumOfNumericChar(s1);
	}
	public static void sumOfNumericChar(String s1) {
		int sum=0;
		for(int i=0;i<s1.length()-1;i++) {
			char c=s1.charAt(i);
			if(c>=48 && c<=57) {
				sum=sum+c-48;
			}
		}
		System.out.println(sum);
	}

}
