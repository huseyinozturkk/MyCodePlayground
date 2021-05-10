package d4_hw2.business.concretes;

import d4_hw2.business.abstracts.CampaignService;
import d4_hw2.entities.concretes.Campaign;
import d4_hw2.entities.concretes.Game;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign, Game game) {
		game.setCampaignDiscount(campaign.getCampaignDiscount());
		
	}

	@Override
	public void deleteCampaign(Game game) {
		game.setCampaignDiscount(0);
		
	}

	@Override
	public void setCampaign(Campaign campaign, int campaignId, String campaignName, double campaignDiscount) {
		campaign.setCampaignId(campaignId);
		campaign.setCampaignName(campaignName);
		campaign.setCampaignDiscount(campaignDiscount);
		System.out.println("Kampanya güncellendi: " + campaign.getCampaignName() + " indirim oraný: " + campaign.getCampaignDiscount());
	}
	
	

}
