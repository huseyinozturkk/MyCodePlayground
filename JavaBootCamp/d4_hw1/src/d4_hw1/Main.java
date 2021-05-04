package d4_hw1;

public class Main {

	public static void main(String[] args) {
		StarbucksCustomer huseyin = new StarbucksCustomer(1,"Hüseyin","Öztürk","huse@gmail.com",1999,"28861499108");
		NeroCustomer engin = new NeroCustomer(2,"Engin","Demiroð","engin@gmail.com",1985,"11111111111");
		
		System.out.println(huseyin.getStarAmount()); // baslangýcta star sayýsý 0
		
		StarbucksCustomerManager customerManager1 = new StarbucksCustomerManager(new CustomerCheckManager());
		NeroCustomerManager customerManager2 = new NeroCustomerManager(new CustomerCheckManager());
		
		customerManager1.addCustomer(huseyin);
		customerManager2.addCustomer(engin);
		
		customerManager1.buyCoffe(huseyin);
		customerManager1.buyCoffe(huseyin);

	}

}
