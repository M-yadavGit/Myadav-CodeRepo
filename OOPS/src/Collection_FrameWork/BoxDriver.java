package Collection_FrameWork;

public class BoxDriver {
	public static void main(String[] args) {
		Box<Integer, Double> b1=new Box<>(12,12.2);
		Box<Double,String> b2=new Box<>(23.2, "Sohan");
		Box<String, Integer> b3=new Box<>("Mohan", 12);
		b1.getDetails();
		b2.getDetails();
		b3.getDetails();
	}

}
