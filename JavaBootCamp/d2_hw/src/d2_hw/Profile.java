package d2_hw;

public class Profile {

	public Profile() {
		System.out.println("Profil oluþturulu.");
		
	}
	
	public Profile(String mail,String name,String surname,String profilePhotoLink) {
		
		this();
		this.mail = mail;
		this.name = name;
		this.surname = surname;
		this.profilePhotoLink = profilePhotoLink;
		
	}
	
	String mail;
	String name;
	String surname;
	String profilePhotoLink;
	
}
