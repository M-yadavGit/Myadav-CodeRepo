package Array_Assignment;

public class Program11 {
	public static void main(String[] args) {
		int [] a= {10,20,30,40,50,60};
		if((a.length-1)%2==0) {
		for(int i=a.length-1;i>=0;i--){
				if(i%2==0)
					System.out.print(a[i]+" ");
			}
		}
		else {
			for(int i=a.length-1;i>=0;i--){
				if(i%2!=0)
					System.out.print(a[i]+" ");
			}
		}
			
	}
}
