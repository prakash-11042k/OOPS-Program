package Object;

public class Bike1 extends Vehicle1 {

	Bike1(String brand){
		super("Bike");
		System.out.println("Brand Name="+brand);
	}
	
	public static void main(String[] args) {
		
		new Bike1("Honda");
	}
}
