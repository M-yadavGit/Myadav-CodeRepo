package Array_Assignment;

public class Program4 {
	public static void main(String[] args) {
		int count=0;
		int [] a= {27,910,36,59,515,35,49,30};
		for(int x:a) {
			if(x>=100 && x<=999)
				count++;
		}
		System.out.print(count);
	}
}
