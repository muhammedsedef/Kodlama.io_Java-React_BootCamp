package gameProjectSimulation.business.concretes;

import gameProjectSimulation.business.abstracts.GameService;
import gameProjectSimulation.entities.concretes.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " is added successfully");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " is deleted successfully");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " is updated successfully");
		
	}

}
