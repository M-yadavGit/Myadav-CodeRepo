package Practice;

public class program4 {
	public static void main(String[] args) {
//		int age=20;
//		boolean result=age>18;
//		System.out.println("User can vote: "+ result);
//		int m=10;
//		int n=2;
//		boolean result=m%n==0;
//		System.out.println("m is factor of n: "+result);
//		int a=237;
//		System.out.println(a%2==0);
//		System.out.println(a%10==7);
//		int b=a%10;
//		System.out.println(b%2!=0);
//		int a=23;
//		int b=15;
//		int c=56;
//		int d=110;
//		String large=a>b?"a is largest":"b is largest";
//		String small=a<b?"a is smallest":"b is smallest";
//		System.out.println(small);
//		System.out.println(large);
//		int large=a>b?a:b;
//		int result=large>c?large:c;
//		int r1=result>d?result:d;
//		System.out.println(result);
//		System.out.println(r1);
//		int p=a>b?(a>c?a:c):(b>c?b:c);
//		System.out.println(p);
		
//		char ch='x';
//		System.out.println(ch>=48 && ch<=57);
//		System.out.println(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u');
		
//		char ch='A';
//		if(!(ch>=65 && ch<=90)) {
//		char upr=(char)(ch-32);
//		System.out.println(upr);
//		}else
//			System.out.println(ch);
//		
		char ch='a';
		char result=(ch>='a'&&ch<='z')?(char)(ch-32):ch;
		System.out.println(result);
	}
}
