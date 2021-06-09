package gameProjectSimulation.business.concretes;

import gameProjectSimulation.business.abstracts.GamerCheckService;
import gameProjectSimulation.entities.concretes.Gamer;

public class GamerCheckManager implements GamerCheckService{
	
	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		return false;
	}

}
