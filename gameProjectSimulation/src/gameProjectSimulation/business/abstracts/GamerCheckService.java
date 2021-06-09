package gameProjectSimulation.business.abstracts;

import gameProjectSimulation.entities.concretes.Gamer;

public interface GamerCheckService {
	boolean checkIfRealPerson(Gamer gamer);
}
