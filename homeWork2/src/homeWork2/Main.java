package homeWork2;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(2, "Muhammed", "Sedef", "muhammetsedef34@gmail.com");
		UserManager userManager = new UserManager();
		userManager.addUser(user1);
		userManager.deleteUser(user1);
		
		Instructor instructor1 = new Instructor("Yaz�l�m Gelistirici");
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiro�");
		instructor1.setEmail("engin@gmail.com");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addInstructor(instructor1);
		
		Student student1 = new Student(1001);
		student1.setId(2);
		student1.setFirstName("Ahmet");
		student1.setLastName("Y�lmaz");
		student1.setEmail("ahmet@gmail.com");
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(student1);
	}

}
