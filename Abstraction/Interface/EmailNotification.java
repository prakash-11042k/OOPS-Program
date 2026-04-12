package Object;

public class EmailNotification implements Notification{

	public void send(String message) {
		System.out.println(message+",message is sending...");
	}
}
