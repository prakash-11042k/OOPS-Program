package Object;

public class ATM1 {

	public static void main(String[] args) {
		
		Bank1 b=new SBI();
		
		b.getBalance();
		b.deposite(1000);
		b.withDraw(2000);
		b.getBalance();
	}
}
