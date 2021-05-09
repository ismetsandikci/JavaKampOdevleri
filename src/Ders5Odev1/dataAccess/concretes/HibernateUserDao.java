package Ders5Odev1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import Ders5Odev1.dataAccess.abstracts.UserDao;
import Ders5Odev1.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	private List<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Kullanýcý Kaydedildi : " + user.getEmail());
	}

	@Override
	public void update(User user) {
		User userUpdate = users.stream()
				.filter(u->u.getId()==user.getId())
				.findFirst()
				.orElse(user);
		
		userUpdate.setEmail(user.getEmail());
		userUpdate.setFirstName(user.getFirstName());
		userUpdate.setLastName(user.getLastName());
		userUpdate.setPassword(user.getPassword());
		userUpdate.setEmailIsVerify(user.isEmailIsVerify());
		
		System.out.println("Kullanýcý Güncellendi : " + user.getEmail());
	}

	@Override
	public void delete(User user) {
		User userToDelete = users.stream()
				.filter(u->u.getId()==user.getId())
				.findFirst()
				.orElse(null);
		users.remove(userToDelete);
		
		System.out.println("Kullanýcý Silindi : " + user.getEmail());
	}

	@Override
	public User getById(int id) {
		User user = users.stream()
				.filter(u -> u.getId()==id)
				.findFirst()
				.orElse(null);
		return user;
	}

	@Override
	public User getByEmail(String email) {
		User user = users.stream()
				.filter(u -> u.getEmail()==email)
				.findFirst()
				.orElse(null);
		return user;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

}
