package Object;

public class ScienceStudent extends Student4{

	int marks;
	
	public ScienceStudent(String name,int age,int marks) {
		super(name,age);
		this.marks=marks;
	}
	
	public void calculateGrade() {
		if(marks>35) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}
}
