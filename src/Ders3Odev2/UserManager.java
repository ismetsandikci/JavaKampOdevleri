package Ders3Odev2;

public class UserManager {
	
	public void add(User user) {
		System.out.println("Kullanıcı Eklendi: " + user.getFirstName() + " " + user.getLastName());
	}
	
	public void update(User user) {
		System.out.println("Kullanıcı Güncellendi: " + user.getFirstName() + " " + user.getLastName());
	}
	
	public void delete(User user) {
		System.out.println("Kullanıcı Silindi: " + user.getFirstName() + " " + user.getLastName());
	}
	
}
