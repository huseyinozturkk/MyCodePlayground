package d4_hw2.business.abstracts;

import d4_hw2.entities.concretes.Campaign;
import d4_hw2.entities.concretes.Customer;
import d4_hw2.entities.concretes.Game;

public interface GameService {
	void addGame(Game game);
	void deleteGame(Game game);
	void changeGamePrice(Game game,double price);
	void changeGameName(Game game,String newName);
	void campaignPrice(Game game,Campaign campaign);
	void buyGame(Game game,Customer customer);
}
