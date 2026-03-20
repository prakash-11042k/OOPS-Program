package Object;

public class Children1 extends Parent1 {

	public void m1() {
		System.out.println("Java Program");
		super.m1();
	}
	
	public static void main(String[] args) {
		
		Children1 c=new Children1();
		c.m1();
	}
}
