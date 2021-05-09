package Ders5Odev1.business.abstracts;

import Ders5Odev1.entities.concretes.LoginDto;
import Ders5Odev1.entities.concretes.User;

public interface AuthService {
	void register (User user);
	void login (LoginDto dto);
	void verifyAccount (User user);
	boolean userExists (String email);
}
