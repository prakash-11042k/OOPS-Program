package Object;

public class User {

	public static void main(String[] args) {
		
		Instagram acc1=new Instagram("Tabrez","tabrez@123@gmail.com",123L,321,"01/01/2000");
		
		System.out.println("\t\t\t*** Account-1 Info ***");
		System.out.println("User_Name:"+acc1.username);
		System.out.println("Email_Id:"+acc1.getEmail());
		System.out.println("Password:"+acc1.getPassword());
		System.out.println("Contact:"+acc1.getContact());
		System.out.println("DOB:"+acc1.getDOB());
		
		System.out.println("\t\t\tUpdate details of Account-1 Info");
		acc1.setEmail("syedtabrez@456gmail.com");
		acc1.setContact(456L);
		acc1.setPassword(654);
		
		System.out.println("\t\t\t*** Account-1 Info ***");
		System.out.println("User_Name:"+acc1.username);
		System.out.println("Email_Id:"+acc1.getEmail());
		System.out.println("Password:"+acc1.getPassword());
		System.out.println("Contact:"+acc1.getContact());
		System.out.println("DOB:"+acc1.getDOB());
	}
}
