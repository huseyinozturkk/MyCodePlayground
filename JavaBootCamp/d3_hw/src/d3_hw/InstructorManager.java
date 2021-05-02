package d3_hw;

public class InstructorManager extends UserManager{
	
	@Override
	public void addUser(User user)  {
		System.out.println("id: "+ user.getId() + " ad-soyad: " + user.getFirstName() + " " + user.getLastName() + " ��retmen eklendi.");
	}
	
	@Override
	public void showUserInfo(User user) {
		System.out.println("��retmen bilgileri: " + user.getFirstName() + " " + user.getLastName() + " " + user.getEmail());
	}
	
	public void changeDetail(Instructor instructor,String detail) {
		instructor.setDetail(detail);
	}
	
	public void addCourseList(Instructor instructor,String[] courses) {
		instructor.setCourses(courses);
	}
}
