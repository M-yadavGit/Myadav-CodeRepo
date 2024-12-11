package Exception_Handling;

public class Program1 {
	public static void main(String[] args) {
		System.out.println("Programg Starts");
		try {
			System.out.println(100+20/0);
		}
		catch(Exception e){
			System.out.println("Infinity");
		}
		System.out.println("Program End");
	}

}
