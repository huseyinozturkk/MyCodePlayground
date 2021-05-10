package d4_hw2.business.abstracts;

import java.util.Date;

import d4_hw2.entities.concretes.Customer;

public interface CustomerService {
	
	void addCustomer(Customer customer);
	void deleteCustomer(Customer customer);
	void changeFirstName(Customer customer,String firstName);
	void changeLastName(Customer customer,String lastName);
	void changeMail(Customer customer,String newMail);
	void changePwd(Customer customer,String newPwd);
	void changeNationalityId(Customer customer,String newNationalityId);
	void changeDateOfBirth(Customer customer,int newDateOfBirth);
	void checkCustomerInfo(Customer customer);

}
