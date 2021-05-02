package d3_hw;

public class UserManager {
	
	public void addUser(User user)  {
		System.out.println("id: "+ user.getId() + " ad-soyad: " + user.getFirstName() + " " + user.getLastName() + " eklendi.");
	}
	
	public void deleteUser(User user)  {
		System.out.println("id: "+ user.getId() + " ad-soyad: " + user.getFirstName() + " " + user.getLastName() + " silindi.");
	}
	
	public void showUserInfo(User user) {
		System.out.println("Kullanýcý bilgileri: " + user.getFirstName() + " " + user.getLastName() + " " + user.getEmail());
	}
	
	public void changeUserEmail(User user,String mail) { 
		user.setEmail(mail);
	}

}
