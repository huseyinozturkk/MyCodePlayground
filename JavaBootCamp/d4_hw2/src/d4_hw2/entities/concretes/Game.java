package d4_hw2.entities.concretes;

import d4_hw2.entities.abstracts.Entities;

public class Game implements Entities{
	private int gameId;
	private String gameName;
	private double gamePrice;
	private double campaignDiscount;
	
	public Game() {
		
	}
	
	public Game(int gameId, String gameName, double gamePrice, double campaignDiscount) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
		this.campaignDiscount = campaignDiscount;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getGamePrice() {
		return gamePrice - (gamePrice * (campaignDiscount/100));
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}

	public double getCampaignDiscount() {
		return campaignDiscount;
	}

	public void setCampaignDiscount(double campaignDiscount) {
		this.campaignDiscount = campaignDiscount;
	}

}
