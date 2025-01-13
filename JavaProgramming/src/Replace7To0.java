import java.util.Scanner;
public class Replace7To0 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	getNumber(n);
	
}
public static void getNumber(int n) {
	int res=0;
	int tenmul=1;
	while(n>0){
		int rem=n%10;
		if(rem!=7 && rem!=0)
			res= tenmul*rem+res;
		
		tenmul=10*tenmul;
		n=n/10;
	}
		System.out.println(res);
}
}
