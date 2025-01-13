package Array_Assignment;

public class Program8 {
	public static void main(String[] args) {
		String [] a= {"a","ab","abcd","pqr","pqrs","xyzx"};
		for(int i=0;i<a.length;i++) {
			if(a[i].length()%2==0)
				System.out.print(a[i]+" ");
		}
	}
}
