package d4_hw2;

import d4_hw2.business.concretes.CampaignManager;
import d4_hw2.business.concretes.CustomerCheckManager;
import d4_hw2.business.concretes.CustomerManager;
import d4_hw2.business.concretes.GameManager;
import d4_hw2.entities.concretes.Campaign;
import d4_hw2.entities.concretes.Customer;
import d4_hw2.entities.concretes.Game;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new CustomerCheckManager());
		CampaignManager campaignManager = new CampaignManager();
		GameManager gameManager = new GameManager();
		
		
		Customer huseyin = new Customer(1,"Hüseyin","Öztürk","12345678123","huseyin@gmail.com","123456789",1999);
		Customer engin = new Customer(2,"Engin","Demiroð","11111111111","engin@gmail.com","1122334455",1985);
		
		customerManager.checkCustomerInfo(huseyin);
		customerManager.addCustomer(engin);
		
		Game game1 = new Game(1,"GTA V",250,0);
		Game game2 = new Game(2,"Terraria",25,20);
		
		gameManager.changeGamePrice(game2,200);
		
		System.out.println(game1.getGamePrice());
		System.out.println(game2.getGamePrice());
		
		Campaign summerSale = new Campaign(1,"Summer Sale",20);
		gameManager.campaignPrice(game1, summerSale);
		
	}

}
