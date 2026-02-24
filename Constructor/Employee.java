package Object;

public class Employee {

	int eid;
	String ename;
	double sal;
	
	public Employee() {
		
	}
	public Employee(int id,String name) {
		eid=id;
		ename=name;
	}
	public Employee(int id,String name,double salary) {
		eid=id;
		ename=name;
		sal=salary;
	}
	public void detailsOfEmp() {
		
		System.out.println("Employee Id is:"+eid);
		System.out.println("Employee Name is:"+ename);
		System.out.println("Employee Salary is:"+sal);
		System.out.println("**************************");
	}
}
