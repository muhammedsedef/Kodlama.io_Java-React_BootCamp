package gameProjectSimulation.business.abstracts;

import gameProjectSimulation.entities.concretes.Campaign;
import gameProjectSimulation.entities.concretes.Game;
import gameProjectSimulation.entities.concretes.Gamer;

public interface SaleService {
	void sale(Game game, Gamer gamer);
	void saleWithCampaign(Game game, Gamer gamer, Campaign campaign);
}
