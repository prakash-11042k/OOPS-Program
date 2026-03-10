package Object;

public class Student1 extends Batch{

	String name="Prakash";
	int age=22;
	
	public void display() {
		System.out.println("Batch Code="+batch_code);
		System.out.println("Subject="+subject);
		System.out.println("No of Student="+no_of_student);
		System.out.println("Name="+name);
		System.out.println("Age="+age);
	}
	
	public static void main(String[] args) {
		
		Student1 s=new Student1();
		s.display();
	}
}
