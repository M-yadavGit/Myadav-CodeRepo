package Array_Assignment;

public class Program3 {
	public static void main(String[] args) {
		int count=0;
		int [] a= {27,90,36,59,55,35,49,30};
		for(int x:a) {
			if(x%2==0)
				count++;
		}
		System.out.print(count);
	}
}
