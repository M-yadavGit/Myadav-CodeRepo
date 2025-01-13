package String;

public class Program5 {
	public static void main(String[] args) {
		String s1="mo08bd5hb367h8";
		int count=0;
		int sum=0;
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			
			if(ch>=48 && ch<=57) {
				count++;
				sum=sum+(ch-48);
			}
			
		}
		System.out.println(count);
		System.out.println(sum);
	}

}
