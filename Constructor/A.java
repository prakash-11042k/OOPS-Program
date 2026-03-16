package Object;

public class A {

	A(){
		System.out.println("No arguments constructor");
	}
	A(int i){
		System.out.println(i);
	}
	A(String s){
		System.out.println(s);
	}
	
	public static void main(String[] args) {
	
		new A();
		new A(10);
		new A("Hii");
	}
}
