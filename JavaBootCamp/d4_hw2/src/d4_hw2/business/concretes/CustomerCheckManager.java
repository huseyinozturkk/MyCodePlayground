package d4_hw2.business.concretes;

import d4_hw2.core.MernisServiceAdapter;
import d4_hw2.entities.concretes.Customer;

public class CustomerCheckManager{
	
	MernisServiceAdapter mernisServiceAdapter = new MernisServiceAdapter();
	
	
	public boolean checkIfRealPerson(Customer customer) {
		
		return mernisServiceAdapter.checkIfRealPerson(customer);
	}

}
