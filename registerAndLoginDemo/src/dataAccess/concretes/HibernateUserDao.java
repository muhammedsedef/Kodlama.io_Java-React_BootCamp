package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	List<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println(user.getFirstName()+" added to database with Hibernate");
	}

	@Override
	public User getUserById(int id) {
		System.out.println("Check whether if id exist or not");
		for(User user : users) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}
	
	@Override
	public User getUserByEmail(String email) {
		System.out.println("Check whether if email exist or not");
		for(User user : users) {
			if(user.getEmail() == email) {
				return user;
			}
		}
		return null;
	}

	@Override
	public void update(User user) {
		System.out.println("User information updated");
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		System.out.println("User successfully deleted, deleted user id : " + user.getId());
	}

	@Override
	public List<User> getAllUser() {
		System.out.println("Get all user from database");
		return users;
	}

}
