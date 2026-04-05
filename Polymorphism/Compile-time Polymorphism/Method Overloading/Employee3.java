package Object;

public class Employee3 {

	public static void display() {
		System.out.println("No arguments method");
	}
	public static void display(String name) {
		System.out.println("Name="+name);
	}
	public static void display(long phone) {
		System.out.println("Phone="+phone);
	}
	
	public static void main(String[] args) {
		
		display();
		display("Venki");
		display(9876543210L);
	}
}
