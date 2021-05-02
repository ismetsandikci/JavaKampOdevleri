package Ders3Odev2;

public class Instructor extends User {

	private String aboutMe;
	
	public Instructor() {
	}

	public Instructor(int id, String firstName, String lastName, String email, String password, String aboutMe) {
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);
		this.setPassword(password);
		this.aboutMe = aboutMe;
	}

	public String getAboutMe() {
		return aboutMe;
	}
	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}
	
}
