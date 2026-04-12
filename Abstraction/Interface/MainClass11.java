package Object;

public class MainClass11 {

	public static void main(String[] args) {
		
		int a=50;
		int b=20;
		
		Calculator1 c1=new CalculatorImplement1();
		c1.add(a, b);
		c1.sub(a, b);
		c1.mul(a, b);
		c1.div(a, b);
	}
}
