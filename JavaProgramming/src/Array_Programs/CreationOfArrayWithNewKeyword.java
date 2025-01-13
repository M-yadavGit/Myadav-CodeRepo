package Array_Programs;

public class CreationOfArrayWithNewKeyword {
	public static void main(String[] args) {
		int [] a=new int[10];
		a[0]=20;
		System.out.println(a[2]);//0
		
		//Run a loop through Array;
		
		System.out.println("============For loop===============");
		int [] b= {10,20,30,22,12};
		for(int i=0;i<b.length;i++)
		System.out.print(b[i]+" ");
		
		System.out.println("\n=========For Each loop===========");
		for(int p:b)
			System.out.print(p+" ");
		
	}

}
