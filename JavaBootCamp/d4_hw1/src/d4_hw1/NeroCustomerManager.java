package d4_hw1;

public class NeroCustomerManager extends CustomerManager{
	
	private ICustomerCheckService customerCheckService;
	
	public NeroCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void addCustomer(Customer customer) {
		super.addCustomer(customer);
		System.out.println("<<Nero>>");
	}
	

	public void buyCoffe(NeroCustomer customer) {
		System.out.println(customer.getFirstName() + " Nero'dan bir kahve aldý.");
	}
}
