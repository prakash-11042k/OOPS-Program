package Object;

public class Children extends Parent {

	String name="Hakkim";
	
	public void display() {
		System.out.println(super.name);
		System.out.println(super.gender);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		Children c=new Children();
		c.display();
	}
}
