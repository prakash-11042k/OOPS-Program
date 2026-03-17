package Object;

public class User1 {

	User1(){
		System.out.println("No arguments constructor");
	}
	User1(String email,String password){
		System.out.println("Email="+email+",Password="+password);
	}
	User1(long phone,String password){
		System.out.println("Phone="+phone+",Password="+password);
	}
	User1(String username,long pin){
		System.out.println("UserName="+username+",PinNo="+pin);
	}
	
	public static void main(String[] args) {
		
		new User1();
		new User1("saro@123",123);
		new User1("9876543210","STR");
		new User1("saro_123",12345);
	}
}
