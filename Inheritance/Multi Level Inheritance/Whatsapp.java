package Object;

public class Whatsapp extends WhatsappV2 {

	public static void main(String[] args) {
		
		Whatsapp w=new Whatsapp();
		w.chat();
		w.status();
		w.calls();
	}
	
	public void calls() {
		System.out.println("Call");
	}
}
