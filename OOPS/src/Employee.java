
public class Employee {
	
	String name;
	int id;
	double salery;
	
	Employee(String name)
	{
		this.name=name;
	}
	Employee(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	Employee(String name, int id, double salery)
	{
		this.name=name;
		this.id=id;
		this.salery=salery;
	}
	Employee(int id,String name, double salery)
	{
		this.name=name;
		this.id=id;
		this.salery=salery;
	}
	public void getDetails()
	{
		System.out.println("Employee name is: " + name);
		System.out.println("Employee id is: "+ id);
		System.out.println("Employee salery is: "+ salery);
		System.out.println("----------------------------------");
	}
}

