package Ders5Odev1.business.abstracts;

import java.util.List;

import Ders5Odev1.entities.concretes.User;

public interface UserService {
	void add(User user);
    void update(User user);
    void delete(User user);

    User getById(int id);
    User getByEmail(String email);
    List<User> getAll();
}
