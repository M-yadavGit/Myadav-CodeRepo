package Recursion;

public class GenrateTableOfaNumber {
	public static void main(String[] args) {
		getTable(16,1);
		
	}
	public static void getTable(int n,int i) {
		if(i<=10) {
		System.out.println(n+"*"+i+"="+n*i);
		getTable(n,i+1);
		}
		
	}    

}
