package d4_hw1;

public class Customer {

	private int Id;
	private String firstName;
	private String lastName;
	private String mail;
	private int yearOfBirth;
	private String nationalityId;
	
	public Customer() {
		
	}
	
	public Customer(int Id, String firstName, String lastName, String mail, int yearOfBirth, String nationalityId) {
		this.Id = Id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mail = mail;
		this.yearOfBirth = yearOfBirth;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

}
