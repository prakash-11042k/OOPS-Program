package Object;

public class MainClass5 {

	public static void main(String[] args) {
		
		Parent3 p=new Parent3();
		Son1 s=new Son1();
		Daughter d=new Daughter();
		
		System.out.println(p instanceof Parent3);
		System.out.println(s instanceof Son1);
		System.out.println(d instanceof Daughter);
		
		System.out.println("---------------------");
		
		System.out.println(s instanceof Parent3);
		System.out.println(d instanceof Parent3);
		
		System.out.println("-------------------- ");
		
		System.out.println(p instanceof Son1);
		System.out.println(p instanceof Daughter);
	}
}
