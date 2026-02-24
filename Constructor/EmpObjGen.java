package Object;

public class EmpObjGen {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		Employee e2=new Employee(1,"Tabrez");
		Employee e3=new Employee(2,"Surya",15000);
		
		e1.detailsOfEmp();
		e2.detailsOfEmp();
		e3.detailsOfEmp();
	}
}
