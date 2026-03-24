package Object;

public class Employees extends Company{

	Employees(String name){
		super("QSP");
		System.out.println("Employee Name="+name);
	}
	
	public static void main(String[] args) {
		
		new Employees("Anjali");
	}
}
