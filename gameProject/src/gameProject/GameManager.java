package gameProject;

public class GameManager {
	public void addGame(Gamer gamer, Game game) {
		gamer.setGame(gamer.getGame() + "  " + game.getGameName());

		System.out.println("Oyun Eklendi : " + game.getGameName() + " : " + gamer.getFirstName());

	}

}
