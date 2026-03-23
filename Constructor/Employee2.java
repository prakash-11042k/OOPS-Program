package Object;

public class Employee2 {

	Employee2(double salary){
		this("Venket");
		System.out.println("Salary="+salary);
	}
	Employee2(String name){
		this(1);
		System.out.println("Name="+name);
	}
	Employee2(int id){
		System.out.println("ID="+id);
	}
	Employee2(long phone){
		this(25000.0);
		System.out.println("Phone="+phone);
	}
	
	public static void main(String[] args) {
		
		new Employee2(6543445671L);
	}
}
