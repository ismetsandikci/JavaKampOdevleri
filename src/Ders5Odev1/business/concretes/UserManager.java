package Ders5Odev1.business.concretes;

import java.util.List;

import Ders5Odev1.business.abstracts.UserService;
import Ders5Odev1.dataAccess.abstracts.UserDao;
import Ders5Odev1.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		this.userDao.add(user);
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
	}

	@Override
	public User getById(int id) {
		return this.userDao.getById(id);
	}

	@Override
	public User getByEmail(String email) {
		return this.userDao.getByEmail(email);
	}

	@Override
	public List<User> getAll() {
		return this.userDao.getAll();
	}

}
