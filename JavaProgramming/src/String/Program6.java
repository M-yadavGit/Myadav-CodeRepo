package String;

public class Program6 {
	public static void main(String[] args) {
		String s1="mohan is running here and there";
		int count=0;
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			count++;
		}
		System.out.println(count);
	}

}
