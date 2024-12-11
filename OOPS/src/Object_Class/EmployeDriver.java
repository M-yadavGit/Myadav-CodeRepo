package Object_Class;

public class EmployeDriver {
	public static void main(String[] args) {
		Employe e1=new Employe("Mohan",101,20000);
		Employe e2=new Employe("Mohan",101,20000);
		Employe e3=new Employe("Rohan",101,20000);
		System.out.println("=======toString()===========");
		System.out.println(e1);
		System.out.println(e1.toString());
		System.out.println(e2);
		System.out.println(e2.toString());
		System.out.println(e3);
		System.out.println(e3.toString());
		System.out.println("=======hashCode()===========");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println("=======equals(Object)=======");
		System.out.println(e1==e2);
		System.out.println("============================");
		System.out.println(e1.equals(e2));
		e1=null;
		System.gc();
	
	}

}
