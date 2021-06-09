package gameProjectSimulation.business.abstracts;

import gameProjectSimulation.entities.concretes.Gamer;

public interface GamerService {
	void add(Gamer game);
	void delete(Gamer game);
	void update(Gamer game);
}
