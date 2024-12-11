package Object_Class;

public class Employe {
	String name;
	int id;
	int salery;
	Employe(){
		
	}
	Employe(int id){
		this.id=id;
	}
	Employe(String name,int id,int salery){
		this.name=name;
		this.id=id;
		this.salery=salery;
	}
	@Override
	public String toString() {
		return "Name is: "+name+" id is: "+id+" salery is: "+salery;
	}
	//@Override
//	public int hashCode() {
//		return id;
//	}
//	public boolean equals(Object o) {
//		Employe e=(Employe)o;
//	return this.id==e.id && this.name.equals(e.name) && this.salary==e.salary;
	
	
}
