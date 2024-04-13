interface D{
	abstract void m1();
	abstract void m2();
}
class L implements D{
	public void m1() {
		System.out.println("satish");
		
	}
	public void m2() {
		System.out.println(".A");
	}
	
}

public class Smtng {

	public static void main(String[] args) {
		L obj=new L();
		obj.m1();
		obj.m2();

	}

}