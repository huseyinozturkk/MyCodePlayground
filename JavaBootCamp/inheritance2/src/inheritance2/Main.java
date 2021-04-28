package inheritance2;

public class Main {
	//Birbirinin alternatifi olan kodlar için if yazýlmaz
	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(new DatabaseLogger());
		//customerManager.add(new FileLogger());
		//customerManager.add(new EmailLogger());
		
		

	}

}
