package gameProjectSimulation.business.concretes;

import gameProjectSimulation.business.abstracts.SaleService;
import gameProjectSimulation.entities.concretes.Campaign;
import gameProjectSimulation.entities.concretes.Game;
import gameProjectSimulation.entities.concretes.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(game.getName() + " game is sold to " + gamer.getFirstName() + " " 
							+ gamer.getLastName() + " for " + game.getPrice() + "$");
		
	}

	@Override
	public void saleWithCampaign(Game game, Gamer gamer, Campaign campaign) {
		double originalPrice = game.getPrice();
		double discountedPrice = originalPrice - ( originalPrice * campaign.getDiscount() ) / 100;
		System.out.println("Dear " + gamer.getFirstName()+ " " + gamer.getLastName() +  ", " + game.getName() + " game's price before discount : " + game.getPrice()+
				"$\ndiscount rate is : " + campaign.getDiscount() + 
				"%\namount due after discount rate is applied : " + discountedPrice + "$" );
	}

}
