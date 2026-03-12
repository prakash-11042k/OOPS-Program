package Object;

public class Account extends Bank {

	String account_holder_name="Veera";
	int account_number=123;
	String address="Theni";
	
	public void displayAccount() {
		System.out.println("Account Holder Name:"+account_holder_name);
		System.out.println("Account Number:"+account_number);
		System.out.println("Address:"+address);
	}
	
	public static void main(String[] args) {
		
		Account a=new Account();
		
		a.displayAccount();
		a.displayBranch();
	}
}
