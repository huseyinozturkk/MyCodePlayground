package d4_hw1;

public class StarbucksCustomerManager extends CustomerManager{
	
	private ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void addCustomer(Customer customer) {
		if (customerCheckService.checkCustomerInfo(customer)) {
			super.addCustomer(customer);
			System.out.println("<<Starbucks>>");
		}else {
			System.out.println("Ge�ersiz kimlik bilgisi");
		}
	}
	
	public void buyCoffe(StarbucksCustomer customer) {
		customer.setStarAmount(customer.getStarAmount() + 1);
		System.out.println(customer.getFirstName() + " Starbuckstan bir kahve ald�. Y�ld�z puan� kazand�n�z. Y�ld�z puan�n�z : " + customer.getStarAmount());
	}
	
}
