package d3_hw;

public class StudentManager extends UserManager{
	
	@Override
	public void addUser(User user)  {
		System.out.println("id: "+ user.getId() + " ad-soyad: " + user.getFirstName() + " " + user.getLastName() + " ��renci eklendi.");
	}
	
	@Override
	public void showUserInfo(User user) {
		System.out.println("��renci bilgileri: " + user.getFirstName() + " " + user.getLastName() + " " + user.getEmail());
	}
	
	
	public void changeStudentNumber(Student student,int studentNumber)  {
		student.setStudentNumber(studentNumber);
	}
	
	public void changeStudentGrade(Student student,int grade)  {
		student.setGrade(grade);
	}
	
}
