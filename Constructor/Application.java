package Object;

public class Application {

	static {
		System.out.println("Mi");
	}
	
	String type,name;
	static String owner="Tabrez";
	
	Application(String type,String name){
		this.type=type;
		this.name=name;
		System.out.println("Using"+name);
	}
	
	{
		System.out.println("Application under use");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		Application app1=new Application("Android","PhonePay");
		
		System.out.println("End");
	}
}
