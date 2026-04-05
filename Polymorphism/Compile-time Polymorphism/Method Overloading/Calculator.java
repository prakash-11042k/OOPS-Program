package Object;

public class Calculator {

	public  void add() {
		System.out.println("No arguments constructor");
	}
	public void add(int a,int b) {
		System.out.println("a+b="+(a+b));
	}
	public void add(int c,double d) {
		System.out.println("c+d="+(c+d));
	}
	public void add(double e,int f) {
		System.out.println("e+f="+(e+f));
	}
	
	public static void main(String[] args) {
		
		Calculator c=new Calculator();
		
		c.add();
		c.add(1,2);
		c.add(1,2.6);
		c.add(3.4,1);
	}
}
