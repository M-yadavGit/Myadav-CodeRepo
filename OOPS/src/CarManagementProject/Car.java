package CarManagementProject;

public class Car {
	String brand;
	int year;
	double price;
	String type;
	String model_name;
	Car(String brand,int year, double price, String type,String model_name){
		this.brand=brand;
		this.year=year;
		this.price=price;
		this.type=type;
		this.model_name=model_name;	
	}
	public String toString() {
		return "Brand "+brand+" year "+year+" price "+price+" type "+type+" model_name "+model_name;
	}

}
