package Object;

public class Employee1Test {

	public static void main(String[] args) {
		
		Employee1[] emp=new Employee1[5];
		
		emp[0]=Employee1.createEmployee1(101, "Amit", 120000);
		emp[1]=Employee1.createEmployee1(102, "Ravi", 95000);
		emp[2]=Employee1.createEmployee1(103, "Neha", 150000);
		emp[3]=Employee1.createEmployee1(104, "Sonal", 80000);
		emp[4]=Employee1.createEmployee1(105, "Rahul", 200000);
		
		System.out.println("Employee having salary more than 1 Lakh:");
		
		for(int i=0;i<emp.length;i++) {
			if(emp[i].getSalary()>100000) {
				System.out.println(emp[i].getName());
			}
		}
	}
}
