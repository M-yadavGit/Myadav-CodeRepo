
public class FruitDriver {
	public static void main(String[] args) {
		Fruit f1=new Fruit();
		f1.getdetails();
		Fruit f2=new Fruit("Mango");
		f2.getdetails();
		Fruit f3=new Fruit("Orange",124);
		f3.getdetails();
		Fruit f4=new Fruit("Apple", 125,2);
		f4.getdetails();
		Fruit f5=new Fruit("Banana",126,3);
		f5.getdetails();
		Fruit f6=new Fruit("Alphanzo",126,3,"yellow");
		f6.getdetails();
	}

}
