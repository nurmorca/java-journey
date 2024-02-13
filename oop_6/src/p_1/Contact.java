package p_1;

public class Contact implements java.io.Serializable {
	private static final long serialVersionUID = 1;
	private String name, phone, mail;
	
	public Contact(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return name + " " + phone + " " + mail;
	}
	
	
	

}
