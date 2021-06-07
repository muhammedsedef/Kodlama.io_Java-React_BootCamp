package homeWork2;

public class Student extends User{
	private int studentId;
	
	public Student(int studentId) {
		super();
		this.studentId = studentId;
	}
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
}