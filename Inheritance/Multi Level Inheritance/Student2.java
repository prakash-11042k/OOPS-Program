package Object;

public class Student2 extends College {

	String name="Prakash";
	String department="BE CSE";
	
	public static void main(String[] args) {
		
		Student2.displayUniversity();
		Student2.displayCollege();
		
		Student2 s=new Student2();
		
		System.out.println("Name="+s.name);
		System.out.println("Department="+s.department);
	}
}
