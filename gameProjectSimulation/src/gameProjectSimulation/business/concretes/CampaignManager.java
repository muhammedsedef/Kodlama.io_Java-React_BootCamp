package gameProjectSimulation.business.concretes;

import gameProjectSimulation.business.abstracts.CampaignService;
import gameProjectSimulation.entities.concretes.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " is added successfully");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " is deleted successfully");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " is updated successfully");
		
	}

}
