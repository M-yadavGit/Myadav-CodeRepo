public class EmployeeDriver {
	public static void main(String[] args) {
	Employee e1=new Employee("Mohan");
	e1.getDetails();
	Employee e2=new Employee("Rohan", 101);
	e2.getDetails();
	Employee e3=new Employee("Sohan",102,30000);
	e3.getDetails();
	Employee e4=new Employee(103,"jackson",20000);
	e4.getDetails();
	
	
	}
}
