package gameProjectSimulation.main;

import java.time.LocalDate;

import gameProjectSimulation.adapters.MernisServiceAdapter;
import gameProjectSimulation.business.concretes.CampaignManager;
import gameProjectSimulation.business.concretes.GameManager;
import gameProjectSimulation.business.concretes.GamerManager;
import gameProjectSimulation.business.concretes.SaleManager;
import gameProjectSimulation.entities.concretes.Campaign;
import gameProjectSimulation.entities.concretes.Game;
import gameProjectSimulation.entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer (1,"Muhammed","Sedef",LocalDate.of(1999, 01, 01),"111111");
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer1);
		
		Game game1 = new Game (1,"Fifa 2021",200.0,"Football Game",LocalDate.of(2020, 04, 14));
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		Campaign campaign1 = new Campaign(1, "Sale", 10);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		
		SaleManager manager = new SaleManager();
		manager.saleWithCampaign(game1, gamer1, campaign1);
		manager.sale(game1, gamer1);

	}

}
