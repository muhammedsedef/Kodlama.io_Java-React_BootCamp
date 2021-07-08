package core.abstracts;

import entities.concretes.User;

public interface EmailService {
	void sendEmail(User user);
}
