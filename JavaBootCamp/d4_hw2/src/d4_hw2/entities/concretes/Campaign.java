package d4_hw2.entities.concretes;

import d4_hw2.entities.abstracts.Entities;

public class Campaign implements Entities{
	private int campaignId;
	private String campaignName;
	private double campaignDiscount;
	
	public Campaign() {
		
	}
	
	public Campaign(int campaignId, String campaignName, double campaignDiscount) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.campaignDiscount = campaignDiscount;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getCampaignDiscount() {
		return campaignDiscount;
	}

	public void setCampaignDiscount(double campaignDiscount) {
		this.campaignDiscount = campaignDiscount;
	}

}
