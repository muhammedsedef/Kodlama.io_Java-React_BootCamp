package business.concretes;

import java.util.regex.Pattern;

import business.abstracts.AuthService;
import business.abstracts.UserService;
import core.abstracts.EmailService;
import core.adapters.GoogleAuthServiceAdapter;
import entities.concretes.User;

public class AuthManager implements AuthService{
	private UserService userService;
	private EmailService emailService;
	private GoogleAuthServiceAdapter googleAuthServiceAdapter;
	
	public AuthManager(UserService userService, EmailService emailService, GoogleAuthServiceAdapter googleAuthServiceAdapter) {
		this.userService = userService;
		this.emailService = emailService;
		this.googleAuthServiceAdapter = googleAuthServiceAdapter;
	}
	

	@Override
	public void register(User user) {
		User existUser = userService.getUserByEmail(user.getEmail());
		if( !(existUser == null)) {
			System.out.println("Email has already exist, email: " + existUser.getEmail());
			return;
		}
		//Email Validation
		if(!checkEmailFormat(user.getEmail())) {
			System.out.println("Email doesnot valid");
			return;
		}
		//Password Validation
		if(!(user.getPassword().length() > 6)) {
			System.out.println("Password must be at least 6 characters");
			return;
		}
		//FirstName and LastName Validation
		if(!(user.getFirstName().length() > 2 && user.getLastName().length() > 2)) {
			System.out.println("First name and last name must be at least 2 characters");
			return;
		}
		
		//If there is no error call userService to add user into database
		userService.register(user);
		emailService.sendEmail(user);//Send email to registered user.
	}

	@Override
	public void login(String email, String password) {
		User user = userService.getUserByEmail(email);
		
		if(!(user == null)) {
			if(!checkEmailFormat(email)) {
				System.out.println("Email validation error, check your email");
			}else {
				if(!(password == user.getPassword())) {
					System.out.println("Password are not match!");
				}else {
					System.out.println("Successfully logged in");
				}
			}
		}else {
			System.out.println("Email doesnot exist");
		}
		
	}

	//Register With Google Account
	@Override
	public void registerWithGoogle(String email) {
		googleAuthServiceAdapter.register(email);
	}

	//Login With Google Account
	@Override
	public void loginWithGoogle(String email) {
		googleAuthServiceAdapter.login(email);
	}
	
	//Validations Rules...
		private boolean checkEmailFormat (String email) {
			String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
			Pattern pattern = Pattern.compile(regex,
			Pattern.CASE_INSENSITIVE);
			return pattern.matcher(email).find();
		}


}
