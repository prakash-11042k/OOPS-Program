package Object;

public class BikeObjGen {

	public static void main(String[] args) {
		
		Bike b1=new Bike();
		Bike b2=new Bike();
		Bike b3=new Bike();
		
		b1.name="Ninja";
		b1.price=350000;
		b1.color="Green";
		
		b2.name="Royal Enfield";
		b2.price=250000;
		b2.color="Black";
		
		System.out.println("\t\t\t 1st Bike Details");
		b1.detailsOfBike();
		System.out.println("\t\t\t 2nd Bike Deatails");
		b2.detailsOfBike();
		System.out.println("\t\t\t 3rd Bike Details");
		b3.detailsOfBike();
	}
}
