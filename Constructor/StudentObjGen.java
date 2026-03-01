package Object;

public class StudentObjGen {

	public static void main(String[] args) {
		
		Student s1=new Student(1,"Prakash",95);
		Student s2=new Student(2,"Saro",34);
		Student s3=new Student(3,"Aadhi",90);
		Student s4=new Student(4,"Kani",15);
		Student s5=new Student(5,"Kodi",96);
		
		Student[] s= {s1,s2,s3,s4,s5};
		
		for(int i=0;i<s.length;i++) {
			if(s[i].marks<35) {
				s[i].detailsOfStudent();
			}
		}
	}
}
