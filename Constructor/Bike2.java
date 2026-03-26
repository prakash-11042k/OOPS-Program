package Object;

public class Bike2 extends Vehicle2 {

	//Implicitly super() call will be added by the compiler
	Bike2(String brand){
		System.out.println("Brand="+brand);
	}
	Bike2(double price){
		System.out.println("Price="+price);
	}
	
	public static void main(String[] args) {
		
		new Bike2("Honda");
		new Bike2(120000);
	}
}
