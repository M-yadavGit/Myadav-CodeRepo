import java.util.Scanner;
public class FacinatingNubmerInRange {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the start number");
	int start=sc.nextInt();
	System.out.println("Enter the end number");
	int end=sc.nextInt();
	for(int i=start;i<=end;i++) {
		if(isFacinating(i))
			System.out.println(i+" it is facinating number");
	}
	
}
	public static boolean isFacinating(int n) {
		String s1=n+""+n*2+""+n*3;
		if(s1.length()>9)
			return false;
		else {
			for(int x='1';x<9;x++) {
				int count=0;
				for(int i=0;i<s1.length();i++) {
					if(x==s1.charAt(i))
						count++;
					if(count<1 || count>1)
						return false;	
				}
			}
			return true;
		}
		
	}
}
