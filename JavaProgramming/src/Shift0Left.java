import java.util.Scanner;
public class Shift0Left {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	shift0left(n);
	
}
public static void shift0left(int n) {
	String res="";
	while(n>0) {
		int rem=n%10;
		if(rem==0)
			res=rem+res;
		else
			res=res+rem;
		
	n=n/10;
	}
	System.out.println(res);
}
}
