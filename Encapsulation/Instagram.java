package Object;

public class Instagram {

	public String username;
	private String email;
	private long contact;
	private int password;
	private String dob;
	
	public Instagram(String username,String email,long contact,int password,String dob) {
		this.username=username;
		this.email=email;
		this.contact=contact;
		this.password=password;
		this.dob=dob;
	}
	
	public String getEmail() {
		return email;
	}
	public long getContact() {
		return contact;
	}
	public int getPassword() {
		return password;
	}
	public String getDOB() {
		return dob;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	public void setPassword(int password) {
		this.password=password;
	}
	public void setContact(long contact) {
		this.contact=contact;
	}
}
