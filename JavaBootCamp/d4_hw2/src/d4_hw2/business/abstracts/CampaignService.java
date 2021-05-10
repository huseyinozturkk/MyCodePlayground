package d4_hw2.business.abstracts;

import d4_hw2.entities.concretes.Campaign;
import d4_hw2.entities.concretes.Game;

public interface CampaignService {
	void addCampaign(Campaign campaign,Game game);
	void deleteCampaign(Game game);
	void setCampaign(Campaign campaign,int campaignId,String campaignName,double campaignDiscount);
	
}
