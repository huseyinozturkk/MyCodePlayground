package d4_hw1;

public class StarbucksCustomer extends Customer {
	
	private int starAmount;
	
	
	public StarbucksCustomer(int Id, String firstName, String lastName, String mail, int yearOfBirth, String nationalityId) {
		super(Id,firstName,lastName,mail,yearOfBirth,nationalityId);
		this.starAmount = 0; // baslagýcta 0
	}

	public int getStarAmount() {
		return starAmount;
	}

	public void setStarAmount(int starAmount) {
		this.starAmount = starAmount;
	}

}
