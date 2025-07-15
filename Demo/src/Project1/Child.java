package Project1;

public class Child extends Father {

	public void Education(String name) {
		System.out.println(name);
	}
	
	public void Education(int Sno) {
		System.out.println(Sno);
	}
	
	public void Active (boolean isactive) {
		System.out.println(isactive);
	}
	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.Bussiness();
		obj.Vehicle();
//		obj.Education("IT");
//		obj.Property();
		obj.Education(1000);
		obj.Active(true);
	}
}