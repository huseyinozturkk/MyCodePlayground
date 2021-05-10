package d4_hw2.core;

import d4_hw2.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.*;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client=new KPSPublicSoapProxy(); 
		boolean result=false;
		try {
			result = client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),customer.getDateOfBirth());
		} 
		catch (Exception e) {
		System.out.println(e);
		return false ;   
		}
		return result;
	}
	
	

}
