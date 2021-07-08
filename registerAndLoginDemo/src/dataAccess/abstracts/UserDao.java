package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {
	void add(User user);
	User getUserById(int id);
	User getUserByEmail(String email);
	void update(User user);
	void delete(User user);
	List <User> getAllUser();
	
}
