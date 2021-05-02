package d3_hw;

public class Main {

	public static void main(String[] args) {
		
		//inheritance
		User user = new User(1,"Ahmet","Öztürk","ahmet@gmail.com");
		
		Student student = new Student(2,"Hüseyin","Öztürk","huseyin@gmail.com",123,4);
	
		String[] courseList1 = {"Java+React","C#+Angular"};
		Instructor engin = new Instructor(3,"Engin","Demiroð","engin@gmail.com",courseList1,"Programming","KRALL");

		
		
		//Polimorfizm
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		
		userManager.addUser(user);
		studentManager.addUser(student);
		instructorManager.addUser(engin);
		
		instructorManager.changeDetail(engin, "Yazýlým geliþtirmeye lisede \"yazýlým\" bölümünde okurken baþladým......");
		String[] courseList2 = {"Java+React","C#+Angular","Programlamaya Giriþ"};
		instructorManager.addCourseList(engin, courseList2);
		
		userManager.changeUserEmail(engin, "engindemirog@gmail.com");
		
		studentManager.changeStudentNumber(student, 99);
		studentManager.changeStudentNumber(student, 5);
		
		
		userManager.showUserInfo(user);
		studentManager.showUserInfo(student);
		instructorManager.showUserInfo(engin);
		
		
	}

}
