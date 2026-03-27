package Object;

public class Donkey extends Animal{

	public void soundd() {
		System.out.println("Hee-Haw");
	}
	
	public static void main(String[] args) {
		
		Animal a1=new Monkey();
		System.out.println(a1.zooName);
		
		Animal a2=new Donkey();
		System.out.println(a2.zooName);
	}
}
