package d3_hw;

public class StudentManager extends UserManager{
	
	@Override
	public void addUser(User user)  {
		System.out.println("id: "+ user.getId() + " ad-soyad: " + user.getFirstName() + " " + user.getLastName() + " öğrenci eklendi.");
	}
	
	@Override
	public void showUserInfo(User user) {
		System.out.println("Öğrenci bilgileri: " + user.getFirstName() + " " + user.getLastName() + " " + user.getEmail());
	}
	
	
	public void changeStudentNumber(Student student,int studentNumber)  {
		student.setStudentNumber(studentNumber);
	}
	
	public void changeStudentGrade(Student student,int grade)  {
		student.setGrade(grade);
	}
	
}
