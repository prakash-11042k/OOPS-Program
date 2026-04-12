package Object;

public class MainClass10 {

	public static void main(String[] args) {
		
		Notification n=new EmailNotification();
		n.send("Hi,how are you!!!");
		
		System.out.println("--------------------------------------");
		
		System.out.println(Notification.name);
	}
}
