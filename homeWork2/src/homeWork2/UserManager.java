package homeWork2;

public class UserManager {
	public void addUser(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " sisteme eklendi");
	}
	
	public void deleteUser(User user) {
		System.out.println("idsi " + user.getId() + " olan " + user.getFirstName() + " " + user.getLastName() + " sistemden silindi");
	}
}