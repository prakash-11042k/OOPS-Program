package Object;

public class Wbt1 {

	public static void main(String[] args) {
		
		RoomNo3 ref=new RoomNo3();
		
		System.out.println("Trainer is:"+ref.trainer);
		System.out.println("Trainer skill is:"+ref.skill);
		System.out.println("Trainer using the Laptop:"+ref.getLaptop());
		ref.setLaptop("Dell");
		System.out.println("Trainer using the Laptop:"+ref.getLaptop());
	}
}
