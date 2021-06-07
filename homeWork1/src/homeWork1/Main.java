package homeWork1;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"Yaz�l�m Gelistirici Yetistirme Kamp� (Java + React)", 10, "Engin Demiro�");
		Course course2 = new Course(2,"Yaz�l�m Gelistirici Yetistirme Kamp� (C# + Angular)", 20, "Engin Demiro�");
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		
		User user1 = new User(1, "Muhammed", "Sedef", "muhammetsedef34@gmail.com");
		User user2 = new User(2, "Engin", "Demiro�", "engin@gmail.com");
		UserManager userManager = new UserManager();
		userManager.addUser(user1);
		userManager.addUser(user2);
	}

}