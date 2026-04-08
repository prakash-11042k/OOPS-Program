package Object;

public class UPI extends Payment{

	void pay() {
		System.out.println("Payment done using UPI!!!");
	}
	
	public static void main(String[] args) {
		
		Payment u=new UPI();
		u.pay();
	}
}
