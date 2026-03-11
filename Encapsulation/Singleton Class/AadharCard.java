package Object;

public class AadharCard {

	String name="Tom";
	private static AadharCard a;
	
	private AadharCard() {
		
	}
	public static AadharCard createAadharCard() {
		if(a==null) {
			a=new AadharCard();
		}
		return a;
	}
}
