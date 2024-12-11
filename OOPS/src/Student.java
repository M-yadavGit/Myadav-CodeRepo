
public class Student {
	String Student_name;
	int Student_id;
	int marks;
	double percentage;
	Student()
	{
		System.out.println("Student object is created");
	}
	Student(String Student_name)
	{
		this();
		this.Student_name=Student_name;
	}
	Student(String Student_name,int Student_id)
	{
		this(Student_name);
		this.Student_id=Student_id;
	}
	Student(String Student_name,int Student_id,int marks)
	{
		this(Student_name,Student_id);
		this.marks=marks;
	}
	Student(String Student_name,int Student_id,int marks, double percentage)
	{
		this(Student_name,Student_id,marks);
		this.percentage=percentage;
	}
	public void getDetails()
	{
		System.out.println("Student name is: "+ Student_name);
		System.out.println("Student id is: "+ Student_id);
		System.out.println("Student marks is: "+ marks);
		System.out.println("Student percentage is: "+ percentage);
		System.out.println("---------------------------------------");
	}
}
