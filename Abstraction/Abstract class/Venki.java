package Object;

public class Venki extends Employee5{

	public void sal() {
		System.out.println("Salary=15000");
	}
	public static void main(String[]args) {
		
		Employee5 e=new Venki();
		e.sal();
		e.role();
	}
}
