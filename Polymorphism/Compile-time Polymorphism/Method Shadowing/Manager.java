package Object;

public class Manager extends Employee4{

	public static void salary() {
		System.out.println("Manager salary=500000");
	}
	
	public static void main(String[] args) {
		
		Employee4.salary();
		Manager.salary();
		
		System.out.println("-------------------------");
		
		Employee4 e=new Manager();
		e.salary();
	}
}
