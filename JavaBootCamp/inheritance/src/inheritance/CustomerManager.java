package inheritance;

public class CustomerManager {
	
	//a�a��daki metodlar�n ad� ayn� buna overloading deniliyor java g�nderilen veriyi alg�lay�p ona g�re blo�u �al��t�r�yor.
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi.");
	}
	
	//bulk insert - bir s�r� datay� tek seferde okumak vs.
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			add(customer);
		}
	}

}
