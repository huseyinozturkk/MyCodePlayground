package d3_hw;

public class Student extends User {
	
	private int studentNumber;
	private int grade;
	
	
	public Student() {
		
	}
	
	public Student(int id,String firstName,String lastName,String email,int studentNumber,int grade) {
		super(id,firstName,lastName,email);
		this.studentNumber = studentNumber;
		this.grade = grade;
	}
	
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getStudentNumber() {
		return studentNumber;
	}
	
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

}
