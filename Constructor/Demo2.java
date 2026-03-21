package Object;

public class Demo2 {

	Demo2(){
		System.out.println("No arguments constructor");
	}
	Demo2(int i){
		this();
		System.out.println(2);
	}
	Demo2(String s){
		this();
		System.out.println(1);
	}
	
	public static void main(String[] args) {
		
		new Demo2(10);
		new Demo2("Hi");
	}
}
