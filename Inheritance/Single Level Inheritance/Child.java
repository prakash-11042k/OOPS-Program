package Object;

public class Child extends Father {

	int age=25;
	
	public static void main(String[] args) {
		
		Child c=new Child();
		
		System.out.println(c.name);
		System.out.println(c.age);
	}
}
