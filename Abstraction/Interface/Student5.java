package Object;

public class Student5 extends College1 implements Sports,Department{

	@Override
	public void department() {
		System.out.println("CSE!!!");
	}
	
	@Override
	public void game() {
		System.out.println("Football!!!");
	}
}
