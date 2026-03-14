package Object;

public class DriverClass {

	public static void main(String[] args) {
		
		Classic c=new Classic();
		
		System.out.println("Brand="+c.brand);
		System.out.println("Color="+c.color);
		System.out.println("Price="+c.price);
		System.out.println("CC="+c.cc);
		
		System.out.println("----------------------");
		
		GT g=new GT();
		
		System.out.println("Brand="+g.brand);
		System.out.println("Color="+g.color);
		System.out.println("Price="+g.price);
		System.out.println("CC="+g.cc);
	}
}
