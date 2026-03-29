package Object;

public class MainClass4 {

	public static void main(String[] args) {
		
		//UpCasting
		Parent2 p=new Son();
		
		//DownCasting
		Son s=(Son) p;
		
		System.out.println(s.parentName);
		System.out.println(s.sonName);
	}
}
