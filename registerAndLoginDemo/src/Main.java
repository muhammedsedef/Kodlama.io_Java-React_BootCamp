import java.util.List;

import business.abstracts.AuthService;
import business.concretes.AuthManager;
import business.concretes.UserManager;
import core.adapters.GoogleAuthManagerAdapter;
import core.concretes.EmailManager;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		AuthService authService = new AuthManager(new UserManager(new HibernateUserDao()), new EmailManager(), new GoogleAuthManagerAdapter());
		
		System.out.println("***** Success Register Examples *****");
		User user = new User(1,"Muhammed","Sedef","muhammetsedef34@gmail.com","1234567");
		User user2 = new User(2,"Ahmet","Yýlmaz","ahmetyilmaz@gmail.com","1234567");
		authService.register(user);
		authService.register(user2);
		
		System.out.println("***** Wrong Register Examples *****");
		User user3 = new User(3,"M","Sedef","muhammetsedef@gmail.com","1234567");
		authService.register(user3);//FirstName Validation Error
		User user4 = new User(4,"Muhammed","S","muhammetsedef1@gmail.com","1234567");
		authService.register(user4);//LastName Validation Error
		User user5 = new User(5,"Muhammed","Sedef","muhammetsedef2gmail.com","1234567");
		authService.register(user5);//Email Validation Error
		User user6 = new User(6,"Muhammed","Sedef","muhammetsedef34@gmail.com","1234567");
		authService.register(user6);//Exist Email Error
		User user7 = new User(7,"Muhammed","Sedef","muhammetsedef3@gmail.com","1234");
		authService.register(user7);//Password Validation Error

		System.out.println("***** End of the signup part *****");
		System.out.println("***** Success Login Example *****");
		authService.login(user.getEmail(), user.getPassword());//Success
		System.out.println("***** Wrong Login Examples *****");
		authService.login(user2.getEmail(), "1234");//Wrong password
		authService.login("abc@gmail.com", "1234567");//Email not exist
		
		System.out.println("***** Register With Google email *****");
		authService.registerWithGoogle(user.getEmail());
		
		System.out.println("***** Login With Google email *****");
		authService.loginWithGoogle(user.getEmail());
	}

}
