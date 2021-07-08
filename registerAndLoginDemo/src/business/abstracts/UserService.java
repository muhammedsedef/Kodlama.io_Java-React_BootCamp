package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(User user);
	void update(User user);
	void delete(User user);
	User getUserById(int id);
	User getUserByEmail(String email);
	List<User> getAllUsers();
}
