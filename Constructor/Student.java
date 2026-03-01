package Object;

public class Student {

	int sid;
	String sname;
	double marks;
	static String school="ST.Joseph";
	
	public  Student(int sid,String sname,double mark) {
		this.sid=sid;
		this.sname=sname;
		marks=mark;
	}
	
	public void detailsOfStudent() {
		
		System.out.println("Student ID:"+sid);
		System.out.println("Student Name:"+sname);
		System.out.println("Student Marks:"+marks);
		System.out.println("School:"+school);
		
		System.out.println("**********************");
	}
}
