package inheritance;

public class CustomerManager {
	
	//aþaðýdaki metodlarýn adý ayný buna overloading deniliyor java gönderilen veriyi algýlayýp ona göre bloðu çalýþtýrýyor.
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi.");
	}
	
	//bulk insert - bir sürü datayý tek seferde okumak vs.
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			add(customer);
		}
	}

}
