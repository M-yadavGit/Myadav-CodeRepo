
public class Fruit {
	String name;
	int price;
	double weight;
	String color;
	Fruit()
	{
		System.out.println("Fruit object is created");
	}
	Fruit(String name)
	{
		this();
		this.name=name;
	}
	Fruit(String name,int price)
	{
		this(name);
		this.price=price;
	}
	Fruit(String name,int price, double weight)
	{
		this(name,price);
		this.weight=weight;
	}
	Fruit(String name,int price, double weight,String color)
	{
		this(name,price,weight);
		this.color=color;
	}
	public void getdetails()
	{
	System.out.println("Fruit name is: "+ name);
	System.out.println("Fruit price is: "+ price);
	System.out.println("Fruit weight is: "+ weight);
	System.out.println("Fruit color is: "+color);
	System.out.println("----------------------------------");
	}
}
