package inheritance;

public class Main {
	//SOLID - Open Closed Principle
	//Bir class ne yapabiliyorsa sadece onlar� yapabilmeli
	
	//Classlar referans tip oldu�u i�in onu extend eden s�n�flar�n referans�n� tutabilir.
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
