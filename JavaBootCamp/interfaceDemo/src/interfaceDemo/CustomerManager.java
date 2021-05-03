package interfaceDemo;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void Add() {
		//i� kodlar� yaz�l�r
		customerDal.add();
	}
}
