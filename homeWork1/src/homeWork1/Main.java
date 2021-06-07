package homeWork1;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"Yazılım Gelistirici Yetistirme Kampı (Java + React)", 10, "Engin Demiroğ");
		Course course2 = new Course(2,"Yazılım Gelistirici Yetistirme Kampı (C# + Angular)", 20, "Engin Demiroğ");
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		
		User user1 = new User(1, "Muhammed", "Sedef", "muhammetsedef34@gmail.com");
		User user2 = new User(2, "Engin", "Demiroğ", "engin@gmail.com");
		UserManager userManager = new UserManager();
		userManager.addUser(user1);
		userManager.addUser(user2);
	}

}