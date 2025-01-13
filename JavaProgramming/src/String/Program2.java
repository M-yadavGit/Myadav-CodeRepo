package String;

public class Program2 {
	public static void main(String[] args) {
		int sum=0;
		String s1=new String("abc3b4m5n7s8");
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch>='1' && ch<='9') {
				sum=sum+ch-48;
			}
		}
		System.out.println(sum);
		
	}

}
