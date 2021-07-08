package core.concretes;

import core.abstracts.EmailService;
import entities.concretes.User;

public class EmailManager implements EmailService {

	
	@Override
	public void sendEmail(User user) {
		System.out.println("Email sended to " + user.getFirstName() + " " + user.getLastName() + " email is : " + user.getEmail());
	}

}
