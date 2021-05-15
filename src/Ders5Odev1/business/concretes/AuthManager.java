package Ders5Odev1.business.concretes;

import Ders5Odev1.business.abstracts.AuthService;
import Ders5Odev1.business.validationRules.concretes.AuthValidator;
import Ders5Odev1.dataAccess.abstracts.UserDao;
import Ders5Odev1.entities.concretes.LoginDto;
import Ders5Odev1.entities.concretes.User;

public class AuthManager implements AuthService {

	private UserDao userDao;
	
	public AuthManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void register(User user) {
		if(!userExists(user.getEmail())) {
			if( 
				( AuthValidator.checkName(user.getFirstName(), user.getLastName()) ) &&
				( AuthValidator.checkEmail(user.getEmail()) ) &&
				( AuthValidator.checkPassword(user.getPassword()) )  ){
				
				this.userDao.add(user);
				
				System.out.println("Kayit isleminin tamamlanmasi icin " + user.getEmail() + " mail adresine gönderilen mail ile hesabinizi dogrulayin");
				
				this.verifyAccount(user);
			}
			else {

				System.out.println("Kayit Basarisiz!");
			}
		}
		else {
			System.out.println("Bu E-mail adresi ile kayit mevcut. : " + user.getEmail());
		}
	}

	@Override
	public void login(LoginDto dto) {
		if(userExists(dto.getEmail())) {
			User user = userDao.getByEmail(dto.getEmail());
			if(user.getPassword().equals(dto.getPassword())) {
				System.out.println("Giris basarili : " + dto.getEmail());
			}
			else {
				System.out.println("Sifre Hatasi : " + dto.getEmail());
			}
		}
		else {
			System.out.println("Bu E-mail adresi ile kayit mevcut degil. : " + dto.getEmail());
		}
		
	}

	@Override
	public void verifyAccount(User user) {
		user.setEmailIsVerify(true);
		System.out.println("Hesap dogrulandi");
	}

	@Override
	public boolean userExists(String email) {
		User user = this.userDao.getByEmail(email);
		
		if (user != null) {
			return true;
		}
		return false;
	}

}
