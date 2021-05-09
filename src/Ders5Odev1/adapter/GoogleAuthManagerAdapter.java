package Ders5Odev1.adapter;

import Ders5Odev1.business.abstracts.AuthService;
import Ders5Odev1.entities.concretes.LoginDto;
import Ders5Odev1.entities.concretes.User;
import Ders5Odev1.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService {

	GoogleAuthManager googleAuthManager = new GoogleAuthManager();
	
	@Override
	public void register(User user) {
		
		googleAuthManager.register(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());
	}

	@Override
	public void login(LoginDto dto) {
		googleAuthManager.login(dto.getEmail(), dto.getPassword());
	}

	@Override
	public void verifyAccount(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean userExists(String email) {
		// TODO Auto-generated method stub
		return false;
	}

}
