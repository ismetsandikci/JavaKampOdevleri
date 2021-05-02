package Ders3Odev2;

public class Student extends User {

	private String address;
	private String cardInfo;
	
	public Student() {
	}

	public Student(int id, String firstName, String lastName, String email, String password, String address, String cardInfo) {
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);
		this.setPassword(password);
		this.address = address;
		this.cardInfo = cardInfo;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCardInfo() {
		return cardInfo;
	}
	public void setCardInfo(String cardInfo) {
		this.cardInfo = cardInfo;
	}
	
}
