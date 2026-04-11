package Object;

public class MainClass9 {

	public static void main(String[] args) {
		
		Student4 s1=new ScienceStudent("Hakim",16,67);
		s1.displayDetails();
		s1.calculateGrade();
		
		System.out.println("--------------------------");
		
		Student4 s2=new ArtsStudent("Malik",17,30);
		s2.displayDetails();
		s2.calculateGrade();
	}
}
