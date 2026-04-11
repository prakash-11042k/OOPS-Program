package Object;

public abstract class Student4 {

	String name;
	int age;
	
	public Student4(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	abstract void calculateGrade();
	
	void displayDetails() {
		System.out.println("Name="+name);
		System.out.println("Age="+age);
	}
}
