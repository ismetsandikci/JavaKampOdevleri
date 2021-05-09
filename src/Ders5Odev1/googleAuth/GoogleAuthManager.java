package Ders5Odev1.googleAuth;


public class GoogleAuthManager {

	public void register(int id, String firstName, String lastName, String email, String password) {
		System.out.println("Google hesabi ile kayit iþlemi tamamlandi : " + email);
	}

	public void login(String email, String password) {
		System.out.println("Google hesabi ile giriþ yapildi : " + email);
	}
		
}
