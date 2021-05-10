package d4_hw2.business.concretes;

import d4_hw2.business.abstracts.GameService;
import d4_hw2.entities.concretes.Campaign;
import d4_hw2.entities.concretes.Customer;
import d4_hw2.entities.concretes.Game;

public class GameManager implements GameService{

	@Override
	public void addGame(Game game) {
		System.out.println(game.getGameName() + "eklendi.");
		
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println(game.getGameName() + "silindi.");
		
	}

	@Override
	public void changeGamePrice(Game game, double price) {
		game.setGamePrice(price);
		System.out.println(game.getGameName() + "Fiyatý : " + game.getGamePrice());
		
	}

	@Override
	public void changeGameName(Game game, String newName) {
		game.setGameName(newName);
		
	}

	@Override
	public void campaignPrice(Game game, Campaign campaign) {
		game.setCampaignDiscount(campaign.getCampaignDiscount());
		System.out.println(game.getGameName() + " Ýndirimli fiyatý : " + game.getGamePrice());
		
	}

	@Override
	public void buyGame(Game game, Customer customer) {
		// TODO Auto-generated method stub
		
	}

}
