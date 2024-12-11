
public class Animal {
	String species;
	int age;
	double weight;
	Animal()
	{
		System.out.println("Animal object is created");
	}
	Animal(String species)
	{
		this();
		this.species=species;
	}
	Animal(String species,int age)
	{
		this(species);
		this.age=age;
	}
	Animal(String species,int age,double weight)
	{
		this(species,age);
		this.weight=weight;
	}
	public void getDetails()
	{
		System.out.println("Animal Species is: "+species);
		System.out.println("Animal age is: "+age);
		System.out.println("Animal weight is: "+ weight);
		System.out.println("---------------------------------");
	}
}
