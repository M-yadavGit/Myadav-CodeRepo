package Collection_FrameWork;

public class Box<T1,T2> {
	T1 t1;
	T2 t2;
	Box(){
		
	}
	Box(T1 t1, T2 t2){
		this.t1=t1;
		this.t2=t2;
	}
	public void getDetails() {
		System.out.println(t1);
		System.out.println(t2);

	
	}

}
