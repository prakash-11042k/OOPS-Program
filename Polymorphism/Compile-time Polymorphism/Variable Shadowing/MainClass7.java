package Object;

public class MainClass7 {

	public static void main(String[] args) {
		
		Parent4 p=new Parent4();
		System.out.println(p.id);
		System.out.println(p.name);
		
		Son2 s=new Son2();
		System.out.println(s.id);
		System.out.println(s.name);
		
		Parent4 p1=new Son2();
		System.out.println(p1.id);
		System.out.println(p1.name);
	}
}
