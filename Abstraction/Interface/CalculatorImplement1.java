package Object;

public class CalculatorImplement1 implements Calculator1{

	public void add(int a,int b) {
		System.out.println("Addition of a and b="+(a+b));
	}
	
	public void sub(int a,int b) {
		System.out.println("Subtraction of a and b="+(a-b));
	}
	
	public void mul(int a,int b) {
		System.out.println("Multiplication of a and b="+(a*b));
	}
	
	public void div(int a,int b) {
		System.out.println("Division of a and b="+(a/b));
	}
}
