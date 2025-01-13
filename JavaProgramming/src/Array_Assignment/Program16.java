package Array_Assignment;

public class Program16 {
	public static void main(String[] args) {
		int[] a= {10,27,39,40,50,1,2,3,5,11,13,343};
		System.out.println("Array Element");
		for(int x:a)
			if(isPrime(x))
			System.out.print(x+" ");
	}
	public static boolean isPrime(int x) {
		if(x<2)
			return false;
		else {
			int i=2;
		while(i*i<=x) {
			if(x%i==0)
				return false;
			i++;
		}
		}
		return true;
	}
}