public class ATM {

	ATM(){
		System.out.println("No arguments constructor");
	}
	ATM(String name,int pin){
		System.out.println("Name="+name+",PinNo="+pin);
	}
	ATM(long acc_no,double balance){
		System.out.println("Account No="+acc_no+",Balance="+balance);
	}
	
	public static void main(String[] args) {
		
		new ATM();
		new ATM("Aadhi",6421);
		new ATM(6287817,900);
	}
	
}
