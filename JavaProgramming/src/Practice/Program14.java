package Practice;

public class Program14 {
	public static void main(String[] args) {
		int [] a= {10,20,30,50};
		int sum=0;
		//for(int i=a.length-1;i>=0;i--)
			for(int x:a)
				sum=sum+x;
			System.out.print(sum+" ");
	}
	
	

}
