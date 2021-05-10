package d4_hw2.business.concretes;

import d4_hw2.business.abstracts.CustomerService;
import d4_hw2.entities.concretes.Customer;

public class CustomerManager implements CustomerService{
	
	CustomerCheckManager customerCheckManager;
	
	public CustomerManager(CustomerCheckManager customerCheckManager) {
		this.customerCheckManager = customerCheckManager;
	}
	
	
	@Override
	public void checkCustomerInfo(Customer customer) {
		if (customerCheckManager.checkIfRealPerson(customer) == true ) {
			System.out.println(customer.getFirstName() + " Geçerli kiþi bilgileri..");
		}else {
			System.out.println(customer.getFirstName() + "Geçersiz kiþi bilgileri..");
		}
		
	}

	@Override
	public void addCustomer(Customer customer) {
		System.out.println(customer.getFirstName() + " sisteme eklendi.");
		
	}

	@Override
	public void deleteCustomer(Customer customer) {
		System.out.println(customer.getFirstName() + " sistemden silindi.");
		
	}

	@Override
	public void changeFirstName(Customer customer, String firstName) {
		customer.setFirstName(firstName);
		
	}

	@Override
	public void changeLastName(Customer customer, String lastName) {
		customer.setLastName(lastName);
		
	}

	@Override
	public void changeMail(Customer customer, String newMail) {
		customer.setEmail(newMail);
		
	}

	@Override
	public void changePwd(Customer customer, String newPwd) {
		customer.setPwd(newPwd);
		
	}

	@Override
	public void changeNationalityId(Customer customer, String newNationalityId) {
		customer.setNationalityId(newNationalityId);
		
	}

	@Override
	public void changeDateOfBirth(Customer customer, int newDateOfBirth) {
		customer.setDateOfBirth(newDateOfBirth);
		
	}

	

}
