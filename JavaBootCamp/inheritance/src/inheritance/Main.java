package inheritance;

public class Main {
	//SOLID - Open Closed Principle
	//Bir class ne yapabiliyorsa sadece onlarý yapabilmeli
	
	//Classlar referans tip olduðu için onu extend eden sýnýflarýn referansýný tutabilir.
	//Polimorfizm
	public static void main(String[] args) {
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "12345";
		
		
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";
		
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(hepsiBurada);
		//customerManager.add(engin);
		
		Customer[] customers = {engin,hepsiBurada};
		
		customerManager.addMultiple(customers);
	}

}
