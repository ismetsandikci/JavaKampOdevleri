package Ders5Odev1.googleAuth;


public class GoogleAuthManager {

	public void register(int id, String firstName, String lastName, String email, String password) {
		System.out.println("Google hesabi ile kayit i�lemi tamamlandi : " + email);
	}

	public void login(String email, String password) {
		System.out.println("Google hesabi ile giri� yapildi : " + email);
	}
		
}
