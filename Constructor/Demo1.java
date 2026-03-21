package Object;

public class Demo1 {

	Demo1(){
		System.out.println("No arguments constructor");
	}
	Demo1(int i){
		this("Hi");
		System.out.println(2);	
	}
	Demo1(String a){
		this();
		System.out.println(1);
	}
	
	public static void main(String[] args) {
		
		new Demo1(10);
	}
}
