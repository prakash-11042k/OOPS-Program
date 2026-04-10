package Object;

public class SBI extends Bank1{

	double balance=2000;
	
	public void getBalance() {
		System.out.println("Balance="+balance);
	}
	
	public void withDraw(double amount) {
		balance=balance-amount;
		System.out.println("WithDraw successfull!!!");
	}
	
	public void deposite(double amount) {
		balance=balance+amount;
		System.out.println("Deposite successfull!!!");
	}
}
