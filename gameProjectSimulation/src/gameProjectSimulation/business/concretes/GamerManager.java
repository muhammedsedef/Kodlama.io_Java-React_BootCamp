package gameProjectSimulation.business.concretes;

import gameProjectSimulation.business.abstracts.GamerCheckService;
import gameProjectSimulation.business.abstracts.GamerService;
import gameProjectSimulation.entities.concretes.Gamer;

public class GamerManager implements GamerService{
	GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		try {
			if(gamerCheckService.checkIfRealPerson(gamer) ) {
				System.out.println(gamer.getFirstName() + " is added successfully");
			}else {
				System.out.println("invalid gamer");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " is added successfully");
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " is added successfully");
	}

}
