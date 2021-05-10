package d4_hw2.core;

import d4_hw2.entities.concretes.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
	
}


