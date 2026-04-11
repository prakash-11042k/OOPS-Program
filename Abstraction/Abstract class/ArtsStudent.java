package Object;

public class ArtsStudent extends Student4{

	int marks;
	
	public ArtsStudent(String name,int age,int marks) {
		super(name,age);
		this.marks=marks;
	}
	
	void calculateGrade() {
		if(marks>35) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}
}
