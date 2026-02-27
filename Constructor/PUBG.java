package Object;

public class PUBG {

	{
		System.out.println("Welcome to PUBG");
	}
	
	String game="pubg";
	
	public PUBG() {
		System.out.println("PUBG object created");
	}
	public void play() {
		System.out.println("Planning pubg");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		PUBG g1=new PUBG();
		
		System.out.println("End");
	}
}
