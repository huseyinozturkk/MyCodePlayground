package d4_hw1;

public abstract class CustomerManager implements ICustomerService{
	
	@Override
	public void addCustomer(Customer customer) {
		System.out.println(customer.getFirstName() + " adlý kullanýcý database'e eklendi.");
	}
	
}
