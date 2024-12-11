package Inheritence_Loading;

public class Driver {
	public static void main(String[] args) {

		System.out.println("this is main method");
//		try {
//	           
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//        
//            e.printStackTrace();
//        }
		ElectricCar e1=new ElectricCar();
		System.out.println("=====================");
		ElectricCar e2=new ElectricCar();
		System.out.println("=====================");
		ElectricCar e3=new ElectricCar();
		System.out.println("=====================");
		System.out.println("this is end the main method");
	
		
	}

}
