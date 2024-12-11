
public class Vehicle {
		String vehicle_brand;
		String vehicle_color;
		double vehicle_price;
		int vehicle_modal;

		Vehicle()
		{
			System.out.println("Vehicle object is created");
		}
		Vehicle(String vehicle_brand)
		{
			this();
			this.vehicle_brand=vehicle_brand;
		}
		Vehicle(String vehicle_brand,String vehicle_color)
		{
			this(vehicle_brand);
			this.vehicle_color=vehicle_color;
		}
		Vehicle(String vehicle_brand,String vehicle_color, double vehicle_price)
		{
			this(vehicle_brand,vehicle_color);
			this.vehicle_price=vehicle_price;
		}
		Vehicle(String vehicle_brand,String vehicle_color, double vehicle_price,int vehicle_modal)
		{
			this(vehicle_brand,vehicle_color,vehicle_price);
			this.vehicle_modal=vehicle_modal;
		}
		public void getdetails()
		{
			System.out.println("Vehicle Brand is: "+ vehicle_brand);
			System.out.println("Vehicle Color is: "+ vehicle_color);
			System.out.println("Vehicle Price is: "+ vehicle_price);
			System.out.println("Vehicle Modal is: "+ vehicle_modal);
			System.out.println("-------------------------------------");
		}
}
