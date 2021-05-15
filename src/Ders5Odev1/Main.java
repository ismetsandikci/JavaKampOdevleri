package Ders5Odev1;

import Ders5Odev1.adapter.GoogleAuthManagerAdapter;
import Ders5Odev1.business.concretes.AuthManager;
import Ders5Odev1.dataAccess.concretes.HibernateUserDao;
import Ders5Odev1.entities.concretes.LoginDto;
import Ders5Odev1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "Ýsmet", "Sandikci", "ismet@ismet", "123456");
		User user2 = new User(2, "User", "User2", "user.2", "123456");
		User user3 = new User(3, "User", "User3", "user@user3", "12345");
		User user4 = new User(4, "U", "User4", "user@user4", "123456");
		User user5 = new User(5, "User", "5", "user@user5", "123456");
		
		AuthManager authManager = new AuthManager(new HibernateUserDao());
		System.out.println("-----Basarisiz Kayitlar-----");
		authManager.register(user2); //Kayit basarisiz mail hatasi
		System.out.println("----------");
		authManager.register(user3); //Kayit basarisiz sifre hatasi 
		System.out.println("----------");
		authManager.register(user4); //Kayit basarisiz isim hatasi
		System.out.println("----------");
		authManager.register(user5); //Kayit basarisiz soysim hatasi
		System.out.println("----------");
		
		System.out.println("\n-----Basarili Kayit-----");
		authManager.register(user1); //Kayit basarili
		
		System.out.println("\n-----Basarisiz Giris-----");
		authManager.login(new LoginDto(user3.getEmail(), user3.getPassword())); //Giris basarisiz mail kayitli degil
		System.out.println("----------");
		authManager.login(new LoginDto(user1.getEmail(), "12345")); //Giriþ basarisiz sifre hatasi

		System.out.println("\n-----Basarili Giris-----");
		authManager.login(new LoginDto(user1.getEmail(), user1.getPassword()));
		
		System.out.println("\n-----Google Ile Kayit-----");
		GoogleAuthManagerAdapter googleAuthManager = new GoogleAuthManagerAdapter();
		googleAuthManager.register(user1);
		googleAuthManager.login(new LoginDto(user1.getEmail(), user1.getPassword()));
	}

}
