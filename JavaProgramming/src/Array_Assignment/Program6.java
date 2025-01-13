package Array_Assignment;

public class Program6 {
	public static void main(String[] args) {
		int sum=0;
		int count=0;
		int [] a= {27,90,36,59,55,35,49,30};
		for(int x:a) {
			count++;
			sum=sum+x;
		}
		System.out.println("Average of elements are: "+sum/count);
	}
}
