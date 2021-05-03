package interfaceDemo;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void Add() {
		//iþ kodlarý yazýlýr
		customerDal.add();
	}
}
