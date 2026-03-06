package Object;

public class Employee1 {

	private int empId;
	private String name;
	private double salary;
	
	private Employee1(int empId,String name,double salary) {
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	
	public static Employee1 createEmployee1(int empId,String name,double salary) {
		return new Employee1(empId,name,salary);
	}
	
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
}
